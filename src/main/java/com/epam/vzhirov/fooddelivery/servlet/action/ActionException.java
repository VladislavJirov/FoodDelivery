package com.epam.vzhirov.fooddelivery.servlet.action;

public class ActionException extends RuntimeException {

    public ActionException() {
        super();
    }

    public ActionException(String message) {
        super(message);
    }

    public ActionException(String message, Throwable cause) {
        super(message, cause);
    }
}
