package com.epam.vzhirov.fooddelivery.servlet.action;

import java.util.HashMap;
import java.util.Map;

public class ActionFactory {

    private static final Map<String,Action> actions = new HashMap<>();

    static {
        actions.put("POST/", new SignUpAction());
        actions.put("GET/", new ShowPage("signup"));
    }

    public static Action getAction(String actionName){
        return actions.get(actionName);
    }


}
