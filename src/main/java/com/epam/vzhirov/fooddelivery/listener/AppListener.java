package com.epam.vzhirov.fooddelivery.listener;

import com.epam.vzhirov.fooddelivery.dao.jdbc.JdbcDaoFactory;
import com.zaxxer.hikari.HikariDataSource;

import javax.annotation.Resource;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.sql.DataSource;

@WebListener
public class AppListener implements ServletContextListener{

    @Resource(name = "jdbc/customcp")
    private DataSource ds;

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
         JdbcDaoFactory.setConnectionPool(ds);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
    }
}
