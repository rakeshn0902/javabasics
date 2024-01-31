package com.training.quest1;

import java.util.Arrays;

public class EmployeeCourses implements Institute {
    @Override
    public String[] showCourses() {
        String[] courses = {"JFS", "Agile", "Cloud", "spring"};
        return courses;
    }
}
