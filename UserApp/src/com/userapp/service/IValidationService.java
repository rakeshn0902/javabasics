package com.userapp.service;

import com.user.exception.NameExistsException;
import com.user.exception.TooLongException;

public interface IValidationService {
    boolean validatePassword(String password) throws TooLongException;

    boolean validateUsername(String username) throws NameExistsException;
}
