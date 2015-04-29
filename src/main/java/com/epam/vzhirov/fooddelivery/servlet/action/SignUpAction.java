package com.epam.vzhirov.fooddelivery.servlet.action;

import javax.servlet.http.HttpServletRequest;

public class SignUpAction implements Action {

    @Override
    public ActionResult execute(HttpServletRequest request) {
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        return new ActionResult("successRegister", true);
    }
}
