package com.epam.vzhirov.fooddelivery.listener;

import javax.annotation.Resource;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.sql.DataSource;
import java.sql.SQLException;

@WebListener
public class AppListener implements ServletContextListener{

    @Resource(name = "jdbc/customcp")
    private static DataSource ds;

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        try {
            System.out.println(ds.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
