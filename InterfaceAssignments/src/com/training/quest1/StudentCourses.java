package com.training.quest1;

import java.util.Arrays;

public class StudentCourses implements Institute {
    @Override
    public String[] showCourses() {
        String[] courses = {"python", "java", "angular", "spring"};
        return courses;
    }
}

