import java.util.Scanner;

public class OverloadMain {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the designation: ");
        String designation = scanner.next();
        System.out.println("Enter the Employee Name: ");
        String employeeName = scanner.next();
        if (designation.equalsIgnoreCase("manager")) {
            Employee employee = new Employee(employeeName, designation);
            employee.calcBonus(10000, 2000);
        } else if (designation.equalsIgnoreCase("programmer")) {
            Employee employee1 = new Employee(employeeName, designation);
            employee1.calcBonus(10000);
        } else if (designation.equalsIgnoreCase("director")) {
            Employee employee2 = new Employee(employeeName, designation);
            employee2.calcBonus(10000, 2000, 3000);
        } else {
            System.out.println("They don't have any allowances");
        }

    }
}

//Overloading
//3.Calculate bonus of different employees using method overloading using a method calcBonus(double allowance)
//class Employee
//Has name, designation as instance variable
//Has parameterised constructor
//Create 3 overloaded methods as
//odouble calcBonus(double basicAllowance)
//odouble calcBonus(double basicAllowance, double carAllowance)
//odouble calcBonus(double basicAllowance, double carAllowance, double houseAllowance)
//class OverloadMain
//Get user input for employee name and designation as Manager, programmer, Director.
//        Create 3 employee objects. Based on the designation call the appropriate calcBonus method
//If the input for designation is Programmer call method with one argument(basicAllowance)
//If the input for designation is Manager, call method with 2 arguments(basicAllowance,carAllowance)
//If the input for designation is Director call method with 3 argumemts(basicAllowance,carAllowance,housingAllowance)