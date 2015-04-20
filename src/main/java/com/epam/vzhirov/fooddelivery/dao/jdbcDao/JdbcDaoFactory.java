package com.epam.vzhirov.fooddelivery.dao.jdbcDao;

import com.epam.vzhirov.fooddelivery.dao.DaoException;
import com.epam.vzhirov.fooddelivery.dao.DaoFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcDaoFactory extends DaoFactory {

    public static final String CONNECTION_STRING = "jdbc:h2:tcp://localhost/blog";
    public static final String USER = "sa";
    public static final String PASSWORD = "sa";
    private static JdbcDaoFactory instance = new JdbcDaoFactory();

    public JdbcDaoFactory() {
    }

    public static JdbcDaoFactory getInstance(){
        return instance;
    }

    public Connection getConnection(){
        Connection connection;
        try{
            connection = DriverManager.getConnection(CONNECTION_STRING, USER, PASSWORD);
        }
        catch (SQLException e){
            throw new DaoException("Cannot get new connection: ", e);
        }
        return connection;
    }

    @Override
    public <T extends JdbcBaseDao> T create(Class<T> daoClass) {
        T dao;
        try {
            dao = daoClass.newInstance();
        } catch (Exception e) {
            throw new DaoException("Cannot create DAO for class: ", e);
        }
        dao.setConnection(getConnection());
        return dao;
    }
}
