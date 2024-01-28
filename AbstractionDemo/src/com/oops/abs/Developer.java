package com.oops.abs;

public class Developer extends TeamLead{
    double chargesperHour;
    String sportsName;

    public Developer(String empName, double salary, int empId, double chargesperHour) {
        super(empName, salary, empId);
        this.chargesperHour = chargesperHour;
    }
    @Override
    void showProjects() {
        System.out.println("Developer works with below projects in: "+COMPANYNAME);

    }
    void gamesClub(){
        System.out.println(sportsName +" "+ chargesperHour);
    }
}
