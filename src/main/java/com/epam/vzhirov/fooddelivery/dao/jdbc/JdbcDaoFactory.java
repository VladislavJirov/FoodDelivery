package com.epam.vzhirov.fooddelivery.dao.jdbc;

import com.epam.vzhirov.fooddelivery.dao.DaoFactory;
import com.epam.vzhirov.fooddelivery.dao.DaoManager;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;


public class JdbcDaoFactory extends DaoFactory {

    private static DataSource dataSource; //= new HikariDataSource();
    //private final static ConnectionPool manualCP = ConnectionPool.getInstance();

    public JdbcDaoFactory() {

//        connectionPool.setDriverClassName("org.h2.Driver");
//        connectionPool.setJdbcUrl("jdbc:h2:tcp://localhost/test");
//        connectionPool.setUsername("sa");
//        connectionPool.setPassword("sa");

    }

    @Override
    public DaoManager createDaoManager() {
        try {
            return new JdbcDaoManager(dataSource.getConnection());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void setConnectionPool(DataSource dataSource) {
        JdbcDaoFactory.dataSource = dataSource;
    }
}
