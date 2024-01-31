package com.training.quest1;

import java.util.Scanner;

public class EmployeeMain {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the user: ");
        String user = scanner.next();
        if (user.equalsIgnoreCase("s")) {
            Institute institute = new StudentCourses();
            String[] courses = institute.showCourses();
            for (int i = 0; i < courses.length; i++) {
                System.out.println(courses[i]);
            }
        } else if (user.equalsIgnoreCase("e")) {
            Institute institute = new EmployeeCourses();
            String[] courses = institute.showCourses();
            for (int i = 0; i < courses.length; i++) {
                System.out.println(courses[i]);
            }
        } else {
            System.out.println("User input is should be either s or e");
        }
    }
}
