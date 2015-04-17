package com.epam.vzhirov.fooddelivery.dao;

import com.epam.vzhirov.fooddelivery.dao.jdbcDao.*;

import java.util.EnumMap;

public abstract class DaoFactory {
    public abstract <T extends JdbcBaseDao> T create(Class<T> daoClass);

    static EnumMap<Type, DaoFactory> factories = new EnumMap<Type, DaoFactory>(Type.class);
    static{
        factories.put(Type.JDBC, JdbcDaoFactory.getInstance());
    }

    public static DaoFactory getInstance(Type type){
        return factories.get(type);
    }

    private enum Type{
        JDBC, XML
    }
}
