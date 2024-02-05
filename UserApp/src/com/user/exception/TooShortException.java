package com.user.exception;

public class TooShortException extends RuntimeException{
    public TooShortException() {
    }

    public TooShortException(String message) {
        super(message);
    }
}
