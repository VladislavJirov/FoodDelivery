package com.epam.vzhirov.fooddelivery;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class ConnectionPool {
    private static ConnectionPool instance;
    private final String DRIVER_NAME;
    private ArrayList<Connection> freeConnections = new ArrayList<>();
    private String URL;
    private String login;
    private String password;
    private int maximumConnections;

    public ConnectionPool(String DRIVER_NAME, String URL, String login, String password, int maximumConnections) {
        this.DRIVER_NAME = DRIVER_NAME;
        this.URL = URL;
        this.login = login;
        this.password = password;
        this.maximumConnections = maximumConnections;
        loadDrivers();
    }

    private void loadDrivers(){
        try{
            Driver driver = (Driver)Class.forName(DRIVER_NAME).newInstance();
            DriverManager.registerDriver(driver);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    static synchronized public ConnectionPool getInstance(String DRIVER_NAME, String URL,
                                                          String login, String password, int maxConn){
        if (instance == null) {instance = new ConnectionPool(DRIVER_NAME,URL,login,password,maxConn);}
        return instance;
    }

    public synchronized Connection getConnection(){
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
        }
        else {
            connection = newConnection();
        }
        return connection;
    }

    private Connection newConnection(){
        Connection connection = null;
        try{
        if (login == null){
            connection = DriverManager.getConnection(URL);
            System.out.println("CONNECTED");}
        else {
            connection = DriverManager.getConnection(URL,login,password);
            System.out.println("CONNECTED");}
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
        return connection;
    }

    public synchronized void freeConnection(Connection connection){
        //put the connection in the end of our free connections list
        if ((connection != null) && (freeConnections.size() <= maximumConnections)){
            freeConnections.add(connection);
        }
    }

    public  synchronized void releaseConnection(){
        for (Connection freeConnection : freeConnections) {
            try {
                freeConnection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            freeConnections.clear();
        }
    }
}
