package com.hospital.utils;

import com.hospital.model.Hospital;
import java.util.Arrays;
import java.util.List;

public class HospitalDetails {
    public static List<Hospital> showHospitals() {
        List<Hospital> hospitals = Arrays.asList(
                new Hospital("Apolo", 1001, "Hyderabad", "Telangana","Clinics"),
                new Hospital("Sakra", 1002, "Banglore", "Karnataka","Emergency Care"),
                new Hospital("AIMS", 1003, "Delhi", "Delhi","Nursing Home"),
                new Hospital("Vijaya", 1004, "Chennai", "Tamilnadu","Radiology")
        );
        return hospitals;
    }
}
