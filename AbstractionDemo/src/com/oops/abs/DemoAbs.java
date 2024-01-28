package com.oops.abs;

public class DemoAbs {
    public static void main(String args[]) {

        Employee employee = new Manager("Rakesh", 10000, 1, "Running");
        employee.calcBonus(2000);
        employee.showProjects();
        employee.printDetails();
        employee.showRules();
        Manager manager = (Manager) employee;
        manager.funClub();

        employee = new Developer("Rakesh", 10000, 1, 100);
        employee.calcBonus(1000);
        employee.showProjects();


        Developer developer = (Developer) employee;
        developer.gamesClub();
    }
}
