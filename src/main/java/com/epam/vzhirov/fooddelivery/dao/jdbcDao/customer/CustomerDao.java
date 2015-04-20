package com.epam.vzhirov.fooddelivery.dao.jdbcDao.customer;

import com.epam.vzhirov.fooddelivery.dao.Dao;
import com.epam.vzhirov.fooddelivery.model.Customer;

import java.util.List;

public interface CustomerDao extends Dao<Customer, Long> {

    //DAO class overrided methods + own methods here
    List<Customer> findByLogin(String name);

}
