package com.epam.vzhirov.fooddelivery.dao.jdbcDao.customer;

import com.epam.vzhirov.fooddelivery.dao.jdbcDao.JdbcBaseDao;
import com.epam.vzhirov.fooddelivery.model.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class JdbcCustomerDao extends JdbcBaseDao<Customer> implements CustomerDao {

    public static final String INSERT_CUSTOMER = "INSERT INTO CUSTOMER (LOGIN,PASSWORD) VALUES (?,?)";

    public JdbcCustomerDao() {

    }

    @Override
    public Long add(Customer customer) {
        Connection connection = null;
           try {
            connection = super.getConnection();
            PreparedStatement ps = connection.prepareStatement(INSERT_CUSTOMER);
            ps.setString(1, customer.getLogin());
            ps.setString(2, customer.getPassword());
            ps.executeUpdate();}
           catch (SQLException e) {
            e.printStackTrace();
        } finally {
               if (connection != null) {
                   try {
                       if (!connection.isClosed()){
                           connection.close();
                       }
                   } catch (SQLException e) {
                       e.printStackTrace();
                   }
               }
           }
        return null;
    }

    @Override
    public void update(Customer customer) {

    }

    @Override
    public void delete(Customer customer) {

    }

    @Override
    public Customer findById(Long id) {
        return null;
    }

    @Override
    public List<Customer> getAll() {
        return null;
    }

    @Override
    public List<Customer> findByLogin(String name) {
        return null;
    }



}
