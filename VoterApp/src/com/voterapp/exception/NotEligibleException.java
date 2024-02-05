package com.voterapp.exception;

public class NotEligibleException extends RuntimeException{
    public NotEligibleException() {
    }

    public NotEligibleException(String message) {
        super(message);
    }
}
