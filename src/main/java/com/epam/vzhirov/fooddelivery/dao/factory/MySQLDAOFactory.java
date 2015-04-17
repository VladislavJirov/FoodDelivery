package com.epam.vzhirov.fooddelivery.dao.factory;

import com.epam.vzhirov.fooddelivery.dao.customer.CustomerDAO;
import com.epam.vzhirov.fooddelivery.dao.customer.MySQLCustomerDAO;


public class MySQLDAOFactory extends DAOFactory {

      @Override
    public CustomerDAO getCustomerDAO() {
        return new MySQLCustomerDAO();
    }
}

