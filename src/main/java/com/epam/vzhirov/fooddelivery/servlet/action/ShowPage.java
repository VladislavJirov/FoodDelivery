package com.epam.vzhirov.fooddelivery.servlet.action;

import javax.servlet.http.HttpServletRequest;

public class ShowPage implements Action {

    private ActionResult actionResult;

    public ShowPage(String pageName) {
        actionResult = new ActionResult(pageName);
    }

    @Override
    public ActionResult execute(HttpServletRequest request) {
        if (actionResult.getPath().equals("signup")){
            request.setAttribute("signup", true);
        }
        return actionResult;
    }
}

