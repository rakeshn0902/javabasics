package com.objects.basics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Student {
    String name;
    String department;

    public Student(String name, String department) {
        this.name = name;
        this.department = department;
    }

    void printDetails() {
        System.out.println("Student name is " + name + "and he belongs to department " + department);
    }

    void getGrades(int... marks) {
        int sum = 0;
        int totalSubjects = marks.length;
        for (int i : marks) {
            sum += i;
        }
        System.out.println("Sum of marks: " + sum);
        int avg = sum / totalSubjects;
        System.out.println("Average marks of students are: " + avg);
        if(avg > 90 && avg <100){
            System.out.println("Student secured A garde");
        }else if(avg > 80 && avg <89){
            System.out.println("Student secured B garde");
        }else if(avg > 70 && avg <79){
            System.out.println("Student secured C garde");
        }else if(avg > 60 && avg <69){
            System.out.println("Student secured D garde");
        }else if(avg > 50 && avg < 59){
            System.out.println("Student secured E garde");
        } else{
            System.out.println("Student secured F garde");
        }
    }

}
