package com.shristi.inheritancedemos;

import java.util.Scanner;

public class ATMMain {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Account Balance: ");
        double accountBalance = scanner.nextDouble();
        System.out.println("Please enter amount: ");
        double amount = scanner.nextDouble();
        System.out.println("Please Account Type: ");
        String accountType = scanner.next().toLowerCase();
        System.out.println("Please action need to be done: ");
        String action = scanner.next();
        Account account = new Account(accountBalance);
        Current current = new Current(accountBalance);
        Savings savings = new Savings(accountBalance);
        switch (accountType) {
            case "current":
                if (action.equalsIgnoreCase("deposit")) {
                    current.deposit(amount);
                } else if (action.equalsIgnoreCase("withdraw")) {
                    current.withdraw(amount);
                } else {
                    System.out.println("Please re-enter action Needed");
                }
                break;
            case "savings":
                if (action.equalsIgnoreCase("deposit")) {
                    savings.deposit(amount);
                } else if (action.equalsIgnoreCase("withdraw")) {
                    savings.withdraw(amount);
                } else {
                    System.out.println("Please re-enter action Needed");
                }
                break;
            default:
                System.out.println("Please re-enter Account Type");
                break;

        }
        double totalBalance = account.getBalance();
        System.out.println("Total Balance of Account is: " + (totalBalance));
    }
}
