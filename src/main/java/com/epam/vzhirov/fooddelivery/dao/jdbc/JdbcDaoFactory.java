package com.epam.vzhirov.fooddelivery.dao.jdbc;

import com.epam.vzhirov.fooddelivery.dao.DaoFactory;
import com.epam.vzhirov.fooddelivery.dao.DaoManager;
import com.zaxxer.hikari.HikariDataSource;


public class JdbcDaoFactory extends DaoFactory {

    private final static HikariDataSource connectionPool = new HikariDataSource();
    //private final static ConnectionPool manualCP = ConnectionPool.getInstance();

    public JdbcDaoFactory() {

        connectionPool.setDriverClassName("org.h2.Driver");
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
