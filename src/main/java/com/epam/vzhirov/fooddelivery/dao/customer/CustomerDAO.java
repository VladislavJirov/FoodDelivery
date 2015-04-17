package com.epam.vzhirov.fooddelivery.dao.customer;

import com.epam.vzhirov.fooddelivery.model.Customer;
import java.sql.SQLException;
import java.util.List;

public interface CustomerDAO {

    //CRUD interface realization
    void addCustomer(Customer customer) throws SQLException;
    void findCustomerById(Long id) throws SQLException;
    void editCustomer(Customer customer) throws SQLException;
    void deleteCustomer(Customer customer) throws SQLException;
    List getAllCustomers() throws SQLException;


}
