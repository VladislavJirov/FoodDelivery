package com.epam.vzhirov.fooddelivery.dao.jdbs;

import com.epam.vzhirov.fooddelivery.dao.CustomerDao;
import com.epam.vzhirov.fooddelivery.model.Customer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JdbcCustomerDao extends JdbcBaseDao<Customer> implements CustomerDao {

    public JdbcCustomerDao() {
    }

    @Override
    public Long add(Customer customer) throws SQLException {
        String insert = "INSERT INTO CUSTOMER (LOGIN,PASSWORD) VALUES (?,?)";
        PreparedStatement ps = super.getConnection().prepareStatement(insert);
        ps.setString(1, customer.getLogin());
        ps.setString(2, customer.getPassword());
        ps.executeUpdate();
        return null;
    }

    @Override
    public void update(Customer customer) throws SQLException {

    }

    @Override
    public void delete(Customer customer) throws SQLException {

    }

    @Override
    public Customer findById(Long id) throws SQLException {
        return null;
    }

    @Override
    public List<Customer> getAll() throws SQLException {
        String getAll = "SELECT * FROM CUSTOMERS";
        PreparedStatement stm = super.getConnection().prepareStatement(getAll);
        ResultSet rs = stm.executeQuery();
        List<Customer> list = new ArrayList<>();
        while (rs.next()) {
            String login = rs.getString("login");
            String password = rs.getString("password");
            Customer c = new Customer(login, password);
            list.add(c);
        }
        return list;
    }

    @Override
    public Customer findByLogin(String name) throws SQLException {
        return null;
    }
}
