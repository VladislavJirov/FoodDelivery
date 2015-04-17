package com.epam.vzhirov.fooddelivery.dao.customer;

import com.epam.vzhirov.fooddelivery.model.Customer;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class MySQLCustomerDAO implements CustomerDAO {

    public MySQLCustomerDAO() {

    }

    public static Connection createConnection(){
        return null;
    }

    @Override
    public void addCustomer(Customer customer) throws SQLException {


    }

    @Override
    public void findCustomerById(Long id) throws SQLException {

    }

    @Override
    public void editCustomer(Customer customer) throws SQLException {

    }

    @Override
    public void deleteCustomer(Customer customer) throws SQLException {

    }

    @Override
    public List getAllCustomers() throws SQLException {
        return null;
    }
}
