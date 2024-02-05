package com.voterapp.client;

import com.voterapp.exception.NotEligibleException;
import com.voterapp.service.ElectionBoothServiceImpl;

import java.util.Scanner;

public class Voter {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        ElectionBoothServiceImpl electionBoothService = new ElectionBoothServiceImpl();
        System.out.println("Enter voter age: ");
        int voterAge = scanner.nextInt();
        System.out.println("Enter voter locality: ");
        String locality = scanner.next();
        System.out.println("Enter voter Id: ");
        int voterId = scanner.nextInt();
        try {
            boolean isValid= electionBoothService.checkEligibility(voterAge, locality, voterId);
            if(isValid){
                System.out.println("Voter is eligible to vote");
            }
        }
        catch (NotEligibleException e){
            System.err.println(e.getMessage());
        }
    }
}
