package com.epam.vzhirov.fooddelivery.servlet.action;

import javax.servlet.http.HttpServletRequest;

public class ShowPage implements Action {

    private ActionResult actionResult;

    public ShowPage(String pageName) {
        actionResult = new ActionResult(pageName);
    }

    @Override
    public ActionResult execute(HttpServletRequest request) {
        String path =actionResult.getPath();
        switch(path){
            case ("signup"): {
                request.setAttribute("signup", true);
                return actionResult;
            }

            default: {
                request.setAttribute("index", true);
                return actionResult;
            }
        }
    }
}

