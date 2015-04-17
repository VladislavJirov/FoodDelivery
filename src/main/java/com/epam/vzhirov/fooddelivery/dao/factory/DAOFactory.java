package com.epam.vzhirov.fooddelivery.dao.factory;

import com.epam.vzhirov.fooddelivery.dao.jdbcDao.customer.CustomerDao;

public abstract class DAOFactory {

    public static final int MYSQL = 1;

    public abstract CustomerDao getCustomerDAO();

    public static DAOFactory getDAOFactory(int factoryNumber){
        switch(factoryNumber){
            case MYSQL: return new MySQLDAOFactory();
            default: return null;

        }
    }
}
