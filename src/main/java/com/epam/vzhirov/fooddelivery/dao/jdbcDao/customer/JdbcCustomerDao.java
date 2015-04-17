package com.epam.vzhirov.fooddelivery.dao.jdbcDao.customer;

import com.epam.vzhirov.fooddelivery.model.Customer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class JdbcCustomerDao implements CustomerDao {

    public static final String INSERT_CUSTOMER = "INSERT INTO CUSTOMER (LOGIN,PASSWORD) VALUES (?,?)";

    public JdbcCustomerDao() {

    }

    public static Connection createConnection(){
        return null;
    }

    @Override
    public void addCustomer(Customer customer) throws SQLException {
        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/blog", "sa", "sa");
            PreparedStatement ps = connection.prepareStatement(INSERT_CUSTOMER);
            ps.setString(1, customer.getLogin());
            ps.setString(2, customer.getPassword());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        }
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
