package com.epam.vzhirov.fooddelivery.dao.jdbcDao;

import com.epam.vzhirov.fooddelivery.dao.Dao;


import java.sql.Connection;

public abstract class JdbcBaseDao <T> implements Dao<T, Long> {

    private Connection connection;

    protected JdbcBaseDao(){}

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection){
        this.connection = connection;
    }
}
