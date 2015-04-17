package com.epam.vzhirov.fooddelivery.dao.jdbcDao.customer;

import com.epam.vzhirov.fooddelivery.model.Customer;
import java.sql.SQLException;
import java.util.List;

public interface CustomerDao {

    //CRUD interface realization plus customer own metods

    void addCustomer(Customer customer) throws SQLException;
    void findCustomerById(Long id) throws SQLException;
    void editCustomer(Customer customer) throws SQLException;
    void deleteCustomer(Customer customer) throws SQLException;
    List getAllCustomers() throws SQLException;


}
