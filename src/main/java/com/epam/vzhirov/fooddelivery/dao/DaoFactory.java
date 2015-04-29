package com.epam.vzhirov.fooddelivery.dao;

import com.epam.vzhirov.fooddelivery.dao.jdbs.JdbcDaoFactory;

public abstract class DaoFactory {

    public static DaoFactory getInstance(Type type) {
        switch (type) {
            case JDBC:
                return new JdbcDaoFactory();
            default:
                throw new DaoException("Implementation for " + type + " doesn't exist");
        }
    }

    public abstract DaoManager createDaoManager();

    public enum Type {JDBC}

}
