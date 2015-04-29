package com.epam.vzhirov.fooddelivery.dao.jdbs;

import com.epam.vzhirov.fooddelivery.dao.AbstractDao;

import java.sql.Connection;

public abstract class JdbcBaseDao <T> implements AbstractDao<T, Long> {

    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
