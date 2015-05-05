package com.epam.vzhirov.fooddelivery;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Logger;

public final class ConnectionPool implements DataSource {

    private static BlockingQueue<Connection> connections;
    private static ConnectionPool instance;
    private String DRIVER_NAME;
    private ArrayList<Connection> freeConnections = new ArrayList<>();
    private String URL;
    private String login;
    private String password;
    private int maximumConnections;

    public static ConnectionPool getInstance() {
        instance = InstanceHolder.CP_HOLDER_INSTANCE;
        Properties prop = new Properties();
        try {
            prop.load(instance.getClass().getResourceAsStream("src/main/resources/cp.properties"));
            for(String key : prop.stringPropertyNames()) {
                String value = prop.getProperty(key);
                System.out.println(key + " => " + value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        instance.DRIVER_NAME = prop.getProperty();
//        instance.URL = prop.getProperty(URL);
//        instance.login = prop.getProperty(login);
//        instance.password = prop.getProperty(password);
//        instance.maximumConnections = maxConn;
//        instance.loadDrivers();
        return instance;
    }

    private void loadDrivers() {
        try {
            Driver driver = (Driver) Class.forName(DRIVER_NAME).newInstance();
            DriverManager.registerDriver(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized Connection getConnection() {
        Connection connection;
        if (!freeConnections.isEmpty()) {
            connection = freeConnections.get(freeConnections.size() - 1);
            freeConnections.remove(connection);
            try {
                if (connection.isClosed()) {
                    connection = getConnection();
                }
            } catch (Exception e) {
                connection = getConnection();
            }
        } else {
            connection = newConnection();
        }
        return connection;
    }

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return null;
    }

    private Connection newConnection() {
        Connection connection = null;
        try {
            if (login == null) {
                connection = DriverManager.getConnection(URL);
                System.out.println("CONNECTED");
            } else {
                connection = DriverManager.getConnection(URL, login, password);
                System.out.println("CONNECTED");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return connection;
    }

    public synchronized void freeConnection(Connection connection) {
        //put the connection in the end of our free connections list
        if ((connection != null) && (freeConnections.size() <= maximumConnections)) {
            freeConnections.add(connection);
        }
    }

    public synchronized void releaseConnection() {
        for (Connection freeConnection : freeConnections) {
            try {
                freeConnection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            freeConnections.clear();
        }
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return null;
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {

    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return 0;
    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {

    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }

    //On Demand Holder
    public static class InstanceHolder {
        private static final ConnectionPool CP_HOLDER_INSTANCE = new ConnectionPool();
    }
}
