package com.epam.vzhirov.fooddelivery.servlet.action;

import javax.servlet.http.HttpServletRequest;

public class Login implements Action {

    @Override
    public ActionResult execute(HttpServletRequest request) {
       /* String login = request.getParameter("login");
        String password = request.getParameter("password");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");

        Customer customer = new Customer(login, password);
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setEmail(email);

        DaoFactory jdbcDaoFactory = DaoFactory.getInstance(DaoFactory.Type.JDBC);
        DaoManager jdbcDaoManager = jdbcDaoFactory.createDaoManager();
        jdbcDaoManager.executeAndClose(daoManager -> {
            try {
                return daoManager.create(CustomerDao.class).add(customer);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
        });*/

        return new ActionResult("c/successfulauth", true);
    }
}
