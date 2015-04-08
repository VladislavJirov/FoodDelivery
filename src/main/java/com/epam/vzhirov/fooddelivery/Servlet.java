package com.epam.vzhirov.fooddelivery;


import com.epam.vzhirov.fooddelivery.model.Order;
import com.epam.vzhirov.fooddelivery.model.factory.OrderFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet", urlPatterns = "/servlet")
public class Servlet extends javax.servlet.http.HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Order order = OrderFactory.getRandomOrder();
       //Menu menu = MenuFactory.getRandomMenu();
        request.setAttribute("order", order);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
        requestDispatcher.forward(request, response);
    }
}
