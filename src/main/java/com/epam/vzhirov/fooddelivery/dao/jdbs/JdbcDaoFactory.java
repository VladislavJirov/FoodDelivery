package com.epam.vzhirov.fooddelivery.dao.jdbs;

import com.epam.vzhirov.fooddelivery.dao.DaoFactory;
import com.epam.vzhirov.fooddelivery.dao.DaoManager;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.SQLException;


public class JdbcDaoFactory extends DaoFactory {

//    private final static HikariConfig config = new HikariConfig("src/main/resources/hikari.properties");
    private final static HikariDataSource connectionPool = new HikariDataSource();

    public JdbcDaoFactory() {
        connectionPool.setJdbcUrl("jdbc:h2:tcp://localhost/test");
        connectionPool.setUsername("sa");
        connectionPool.setPassword("sa");

    }

    @Override
    public DaoManager createDaoManager() {
        try {
            return new JdbcDaoManager(connectionPool.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}