package com.user.exception;

public class NameExistsException extends  RuntimeException{
    public NameExistsException() {
    }

    public NameExistsException(String message) {
        super(message);
    }
}
