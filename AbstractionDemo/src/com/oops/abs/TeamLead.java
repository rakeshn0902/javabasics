package com.oops.abs;

public abstract class TeamLead extends Employee {
    public TeamLead(String empName, double salary, int empId) {
        super(empName, salary, empId);
    }

    @Override
    void calcBonus(double amount) {
        System.out.println("TeamLead is having salary of" + (amount + salary));
    }

}
