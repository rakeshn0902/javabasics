package com.oops.abs;

public class Manager extends Employee {
    String activity;

    public Manager(String empName, double salary, int empId, String activity) {
        super(empName, salary, empId);
        this.activity = activity;
    }
    @Override
    void calcBonus(double amount) {
        System.out.println("Total Employee salary received by Manager is+ " + (amount+salary));
    }
    @Override
    void showProjects() {
        System.out.println("Manager is working with below projects in "+COMPANYNAME);
    }
    void funClub() {
        System.out.println("Activity " + activity);
    }
}
