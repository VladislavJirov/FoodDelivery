package com.epam.vzhirov.fooddelivery;

import com.epam.vzhirov.fooddelivery.dao.CustomerDao;
import com.epam.vzhirov.fooddelivery.dao.DaoCommand;
import com.epam.vzhirov.fooddelivery.dao.DaoFactory;
import com.epam.vzhirov.fooddelivery.dao.DaoManager;
import com.epam.vzhirov.fooddelivery.model.Customer;

import java.io.*;
import java.sql.SQLException;
import java.util.List;


public class Runner {

    public static void main(String[] args) throws SQLException, IOException{

        DaoFactory jdbcDaoFactory = DaoFactory.getInstance(DaoFactory.Type.JDBC);
        DaoManager jdbcDaoManager = jdbcDaoFactory.createDaoManager();
        List<Customer> customers = jdbcDaoManager.executeAndClose(daoManager -> {
            try {
                return daoManager.create(CustomerDao.class).getAll();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
        });

        System.out.println(customers.get(0).toString());



 /*       Customer customer = new Customer("login", "pass");

        ConnectionPool pool = ConnectionPool.getInstance("org.h2.Driver",
                "jdbc:h2:tcp://localhost/test", "sa", "sa", 5);

        try {
            DAOFactory sqlFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
            CustomerDao mySQL  = sqlFactory.getCustomerDAO();
            mySQL.addCustomer(customer);
        } catch (Exception e) {
            e.printStackTrace();
        }*/


        // connectionPool.freeConnection(connection);
        // connectionPool.releaseConnection();

    }
}
