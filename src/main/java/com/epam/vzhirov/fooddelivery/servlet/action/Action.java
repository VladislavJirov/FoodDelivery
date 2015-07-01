package com.epam.vzhirov.fooddelivery.servlet.action;

import javax.servlet.http.HttpServletRequest;

public interface Action {

    ActionResult execute(HttpServletRequest request);

}

