package com.shristi.overloading;

public class Employee {
    String name;
    String designation;

    public Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    double calcBonus(double basicAllowance) {
        double totalBonus = basicAllowance;
        return totalBonus;
    }

    double calcBonus(double basicAllowance, double
            carAllowance) {
        double totalBonus = basicAllowance+carAllowance;
        return totalBonus;
    }

    double calcBonus(double basicAllowance, double
            carAllowance, double houseAllowance) {
        double totalBonus = basicAllowance+carAllowance;
        return totalBonus;
    }
}
