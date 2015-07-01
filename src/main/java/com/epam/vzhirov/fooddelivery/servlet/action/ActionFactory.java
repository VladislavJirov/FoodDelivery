package com.epam.vzhirov.fooddelivery.servlet.action;

import java.util.HashMap;
import java.util.Map;

public class ActionFactory {

    private static final Map<String,Action> actions = new HashMap<>();

    static {
        actions.put("POST/c/signup", new NewUser());

        actions.put("GET/c/signup", new ShowPage("signup"));
        actions.put("GET/c/login", new ShowPage("login"));
        actions.put("GET/c/index", new ShowPage("index"));
        actions.put("GET/c/", new ShowPage("index"));

        actions.put("GET/c/successfulauth", new ShowPage("successfulauth"));
    }

    public static Action getAction(String actionName){
        return actions.get(actionName);
    }


}
