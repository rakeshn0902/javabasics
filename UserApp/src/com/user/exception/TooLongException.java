package com.user.exception;

public class TooLongException extends RuntimeException {
    public TooLongException() {
    }

    public TooLongException(String message) {
        super(message);
    }
}
