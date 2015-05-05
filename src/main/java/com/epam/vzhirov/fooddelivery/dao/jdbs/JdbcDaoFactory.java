package com.epam.vzhirov.fooddelivery.dao.jdbs;


import com.epam.vzhirov.fooddelivery.dao.DaoFactory;
import com.epam.vzhirov.fooddelivery.dao.DaoManager;
import com.zaxxer.hikari.HikariDataSource;

public class JdbcDaoFactory extends DaoFactory {

    private final static HikariDataSource connectionPool = new HikariDataSource();
    // private final static ConnectionPool manualCP = ConnectionPool.getInstance();
    //@Resource(name = "jdbc/customcp")
    //private static DataSource ds;

    public JdbcDaoFactory() {
        connectionPool.setJdbcUrl("jdbc:h2:tcp://localhost/test");
        connectionPool.setUsername("sa");
        connectionPool.setPassword("sa");
    }

    @Override
    public DaoManager createDaoManager() {
        try {
            return new JdbcDaoManager(connectionPool.getConnection());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
