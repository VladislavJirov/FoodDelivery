package com.epam.vzhirov.fooddelivery.servlet.action;

import java.util.HashMap;
import java.util.Map;

public class ActionFactory {

    private static final Map<String,Action> actions = new HashMap<>();

    static {
        actions.put("POST/controller/signup", new SignUpAction());

        actions.put("GET/controller/signup", new ShowPage("signup"));
        actions.put("GET/controller/index", new ShowPage("index"));
        actions.put("GET/controller/", new ShowPage("index"));
        actions.put("GET/controller/successfulauth", new ShowPage("successfulauth"));
    }

    public static Action getAction(String actionName){
        return actions.get(actionName);
    }


}
