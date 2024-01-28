package com.oops.abs;

public abstract class Employee {

    String empName;
    double salary;
    int empId;
    final String COMPANYNAME = "eyeMed";

    public Employee(String empName, double salary, int empId) {
        this.empName = empName;
        this.salary = salary;
        this.empId = empId;
    }

    void printDetails() {
        System.out.println("Here are the details of employee" + empName + empId);
    }

    abstract void calcBonus(double amount);

    abstract void showProjects();

    final void showRules() {
        officeHours();
        System.out.println("leave policies");
        System.out.println("od policies");

    }

    private void officeHours() {
        System.out.println("10 hours per day");
    }
}
