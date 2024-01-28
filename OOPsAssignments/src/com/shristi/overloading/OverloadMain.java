package com.shristi.overloading;

import java.util.Scanner;

public class OverloadMain {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee Name: ");
        String employeeName = scanner.next();
        System.out.println("Enter Employee Designation: ");
        String employeeDesignation = scanner.next();
        Employee employee = new Employee(employeeName, employeeDesignation);
        if (employeeDesignation.equalsIgnoreCase("programmer")) {
            double salary = employee.calcBonus(1800);
            System.out.println("Employee Salary along with all Bonuses are: " + salary);
        } else if (employeeDesignation.equalsIgnoreCase("Manager")) {
            double salary = employee.calcBonus(20000, 1000);
            System.out.println("Employee Salary along with all Bonuses are: " + salary);
        } else if (employeeDesignation.equalsIgnoreCase("Director")) {
            double salary = employee.calcBonus(25000, 3000, 5000);
            System.out.println("Employee Salary along with all Bonuses are: " + salary);
        } else {
            System.out.println("There is no designation with name: " + employeeDesignation);
        }
    }
}
