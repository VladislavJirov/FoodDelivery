package com.epam.vzhirov.fooddelivery.servlet;

import com.epam.vzhirov.fooddelivery.servlet.action.Action;
import com.epam.vzhirov.fooddelivery.servlet.action.ActionFactory;
import com.epam.vzhirov.fooddelivery.servlet.action.ActionResult;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/front")
public class Servlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String actionName = req.getMethod() + req.getPathInfo();
        System.out.println(actionName);
        Action action = ActionFactory.getAction(actionName);
        ActionResult result = action.execute(req);

        if (result.isRedirect()) {
            resp.sendRedirect(req.getContextPath() + "/" + result.getPath());
            return;
        }
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/" + result.getPath() + ".jsp");
        requestDispatcher.forward(req, resp);
    }
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

