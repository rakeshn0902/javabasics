package com.userapp.client;

import com.user.exception.NameExistsException;
import com.user.exception.TooLongException;
import com.user.exception.TooShortException;
import com.userapp.service.ValidationServiceImpl;

import java.util.Scanner;

public class Registration {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user name: ");
        String userName = scanner.next();
        ValidationServiceImpl validationService = new ValidationServiceImpl();
        try {
            boolean isValidUserName = validationService.validateUsername(userName);
            if (isValidUserName) {
                System.out.println("Enter Password: ");
                String password = scanner.next();
                boolean isValidPass = validationService.validatePassword(password);
                if (isValidPass) {
                    System.out.println("Welcome " + userName+ " You are registered");
                }
            }
        } catch (NameExistsException | TooShortException | TooLongException e) {
            System.err.println(e.getMessage());
        }
    }
}
