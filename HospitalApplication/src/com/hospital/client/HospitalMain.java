package com.hospital.client;

import com.hospital.exception.HospitalNotFoundException;
import com.hospital.exception.IdNotFoundException;
import com.hospital.model.Hospital;
import com.hospital.service.HospitalImpl;
import com.hospital.service.HospitalInterface;

import java.util.List;

public class HospitalMain {
    public static void main(String[] args) {
        HospitalInterface hospitalIService = new HospitalImpl();
        try {
            List<Hospital> hospitals = hospitalIService.getAll();
            System.out.println("Get all Hospitals");
            for (Hospital hospital : hospitals) {
                System.out.println(hospital);
            }
        } catch (HospitalNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Hospitals By City");
            List<Hospital> hospitalsByCity = hospitalIService.getByCity("Banglore");
            for (Hospital hospital : hospitalsByCity) {
                System.out.println(hospital);
            }
        } catch (HospitalNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Hospitals By Id");
        try {
            Hospital hospitalById = hospitalIService.getById(1002);
            System.out.println(hospitalById);
        } catch (IdNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
