package com.epam.vzhirov.fooddelivery.dao.jdbs;

import com.epam.vzhirov.fooddelivery.dao.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class JdbcDaoManager implements DaoManager {

    private static final Logger logger = LoggerFactory.getLogger(JdbcDaoManager.class);
    private static Map<Class<? extends AbstractDao>, Class<? extends JdbcBaseDao>> daoClasses = new HashMap<>();

    static {
        daoClasses.put(CustomerDao.class, JdbcCustomerDao.class);
    }

    private final Connection connection;

    public JdbcDaoManager(Connection connection) {
        this.connection = connection;
    }

    @Override
    public <T> T executeAndClose(DaoCommand<T> daoCommand) throws DaoException {
        try {
            return daoCommand.execute(this);
        } finally {
            try {
                this.connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public <T extends AbstractDao> T create(Class<T> daoInterface) {
        Class<? extends JdbcBaseDao> daoClass = daoClasses.get(daoInterface);
        JdbcBaseDao dao;
        try {
            dao = daoClass.newInstance();
        } catch (Exception e) {
            throw new DaoException("Cannot create DAO for interface: " + daoInterface, e);
        }
        dao.setConnection(connection);
        return (T) dao;
    }

}
