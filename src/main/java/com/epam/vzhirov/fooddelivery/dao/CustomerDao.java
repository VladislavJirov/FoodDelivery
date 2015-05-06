package com.epam.vzhirov.fooddelivery.dao;

import com.epam.vzhirov.fooddelivery.model.Customer;

import java.sql.SQLException;

public interface CustomerDao extends AbstractDao<Customer,Long> {


       Customer findByLogin(String name) throws SQLException;

}
