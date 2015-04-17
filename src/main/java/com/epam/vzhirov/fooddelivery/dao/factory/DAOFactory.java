package com.epam.vzhirov.fooddelivery.dao.factory;

import com.epam.vzhirov.fooddelivery.dao.customer.CustomerDAO;

public abstract class DAOFactory {

    public static final int MYSQL = 1;

    public abstract CustomerDAO getCustomerDAO();

    public static DAOFactory getDAOFactory(int factoryNumber){
        switch(factoryNumber){
            case MYSQL: return new MySQLDAOFactory();
            default: return null;

        }
    }
}
