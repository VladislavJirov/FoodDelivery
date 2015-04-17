package com.epam.vzhirov.fooddelivery;

import com.epam.vzhirov.fooddelivery.dao.jdbcDao.customer.CustomerDao;
import com.epam.vzhirov.fooddelivery.dao.factory.DAOFactory;
import com.epam.vzhirov.fooddelivery.model.Customer;

import java.io.*;

public class Runner {

    public static void main(String[] args) throws IOException{
        Customer customer = new Customer("login", "pass");

        ConnectionPool pool = ConnectionPool.getInstance("org.h2.Driver",
                "jdbc:h2:tcp://localhost/test", "sa", "sa", 5);

        try {
            DAOFactory sqlFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
            CustomerDao mySQL  = sqlFactory.getCustomerDAO();
            mySQL.addCustomer(customer);
        } catch (Exception e) {
            e.printStackTrace();
        }


        // connectionPool.freeConnection(connection);
        // connectionPool.releaseConnection();

    }
}
