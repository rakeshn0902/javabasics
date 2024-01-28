package com.shristi.inheritancedemos;

public class Current extends Account {
    public Current(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        System.out.println("Money is withdrawn from Current Account and remaining balance is " + (balance - amount));
    }

    @Override
    void deposit(double amount) {
        System.out.println("Money is Deposited in Current Account and remaining balance is" + (balance + amount));
    }
}
