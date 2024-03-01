package com.hospital.exception;

public class HospitalNotFoundException extends Exception{
    private static final long serialVersionUID = 1L;
    public HospitalNotFoundException() {
    }
    public HospitalNotFoundException(String message) {
        super(message);
    }
}
