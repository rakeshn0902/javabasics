package com.objects.basics;

import java.util.Scanner;

public class StudentMain {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        String studentName = scanner.next();
        System.out.println("Enter Student Department: ");
        String studentDepartment = scanner.next();
        System.out.println("Enter Total Number of subjects Marks: ");
        int totalNumberOfSUbjects = scanner.nextInt();
        int[] marks = new int[totalNumberOfSUbjects];
        for(int i = 0; i < marks.length; i++){
            System.out.println((i+1) + " Subject Marks: ");
            marks[i] = scanner.nextInt();
        }
        Student student = new Student(studentName, studentDepartment);
        student.printDetails();
        student.getGrades(marks);
    }
}
