package com.epam.vzhirov.fooddelivery.servlet;

import com.epam.vzhirov.fooddelivery.dao.DaoFactory;
import com.epam.vzhirov.fooddelivery.dao.jdbcDao.customer.CustomerDao;
import com.epam.vzhirov.fooddelivery.dao.jdbcDao.customer.JdbcCustomerDao;
import com.epam.vzhirov.fooddelivery.model.Customer;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



@WebServlet(name = "Servlet", urlPatterns = "/signup")
public class Servlet extends javax.servlet.http.HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String firstName = req.getParameter("firstName");
        String login = req.getParameter("login");
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        Customer customer = new Customer(login,password);
        CustomerDao cd = DaoFactory.getInstance(DaoFactory.Type.JDBC).create(JdbcCustomerDao.class);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
