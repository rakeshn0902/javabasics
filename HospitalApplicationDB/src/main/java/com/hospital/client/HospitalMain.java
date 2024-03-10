package com.hospital.client;

import com.hospital.exception.HospitalNotFoundException;
import com.hospital.model.Hospital;
import com.hospital.service.HospitalServiceImpl;
import com.hospital.service.IHospitalService;

import java.util.List;

public class HospitalMain {
    public static void main(String[] args) {
        IHospitalService hospitalService = new HospitalServiceImpl();
        System.out.println("Register new Hospital");
        Hospital hospital = new Hospital("apolo", 1, "Banglore", "Karnataka", "Children Hospital");
        hospitalService.registerHospital(hospital);
        Hospital hospital1 = new Hospital("Sakra", 1, "Chennai", "Karnataka", "Super Speciality");
        hospitalService.registerHospital(hospital1);
        System.out.println("Hospital is Registered");

        try {
            List<Hospital> hospitals = hospitalService.getHospitals();
            hospitals.stream().forEach(hospital2 -> System.out.println(hospital2));
        } catch (HospitalNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

}
