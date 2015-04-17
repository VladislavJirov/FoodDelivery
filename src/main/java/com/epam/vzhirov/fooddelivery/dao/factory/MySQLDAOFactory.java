package com.epam.vzhirov.fooddelivery.dao.factory;

import com.epam.vzhirov.fooddelivery.dao.jdbcDao.customer.CustomerDao;
import com.epam.vzhirov.fooddelivery.dao.jdbcDao.customer.JdbcCustomerDao;


public class MySQLDAOFactory extends DAOFactory {

      @Override
    public CustomerDao getCustomerDAO() {
        return new JdbcCustomerDao();
    }
}

