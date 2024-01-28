package com.shristi.inheritancedemos;

public class Savings extends Account {
    public Savings(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        System.out.println("Money is withdrawn from Savings Account and remaining balance is" + (balance - amount));
    }

    @Override
    void deposit(double amount) {
        System.out.println("Money is Deposited in Savings Account and remaining balance is" + (balance + amount));
    }
}
