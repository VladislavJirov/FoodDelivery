package com.epam.vzhirov.fooddelivery.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/signin")
public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req,resp);
    }

    void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String actionName = req.getMethod() + req.getPathInfo();
        req.getRequestDispatcher("signin.jsp").forward(req,resp);
    }


//    @Override //Отдаем данные серверу
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//        String firstName = req.getParameter("firstName");
//        String login = req.getParameter("login");
//        String email = req.getParameter("email");
//        String password = req.getParameter("password");
//
//        Customer customer = new Customer(login,password);
//        CustomerDao cd = DaoFactory.getInstance(DaoFactory.Type.JDBC).create(JdbcCustomerDao.class);
//    }
//
//    @Override //Запрашиваем данные у сервера
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.getRequestDispatcher("/WEB-INF/signup.jsp").forward(req, resp);
//    }
}
