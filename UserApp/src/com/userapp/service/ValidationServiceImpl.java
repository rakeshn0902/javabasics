package com.userapp.service;

import com.user.exception.NameExistsException;
import com.user.exception.TooLongException;
import com.user.exception.TooShortException;

public class ValidationServiceImpl implements IValidationService {
    @Override
    public boolean validateUsername(String username) throws NameExistsException {
        String[] usernames = {"Sri", "Priya", "Joe", "Kathy"};
        for (String username1 : usernames) {
            if (username1.equalsIgnoreCase(username)) {
                throw new NameExistsException("User Name already Exists");
            }
        }
        return true;
    }

    @Override
    public boolean validatePassword(String password) throws TooLongException, TooShortException {
        if (password.length() < 6) {
            throw new TooLongException("Password is too short");
        } else if (password.length() > 15) {
            throw new TooShortException("Password is too long");
        } else {
            return true;
        }
    }
}
