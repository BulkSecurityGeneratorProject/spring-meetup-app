package com.cegeka.academy.web.rest.errors;

public class ExpiredObjectException extends RuntimeException {

    String message;

    @Override
    public String getMessage() {
        return message;
    }

    public ExpiredObjectException setMessage(String message) {
        this.message = message;
        return this;
    }
}
