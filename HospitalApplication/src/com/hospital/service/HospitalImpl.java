package com.hospital.service;

import com.hospital.exception.HospitalNotFoundException;
import com.hospital.exception.IdNotFoundException;
import com.hospital.model.Hospital;
import com.hospital.utils.HospitalDetails;
import java.util.List;
import java.util.stream.Collectors;

public class HospitalImpl implements HospitalInterface {

    @Override
    public List<Hospital> getAll() throws HospitalNotFoundException {
        List<Hospital> hospitals = HospitalDetails.showHospitals();
        List<Hospital> hospitalList =hospitals.stream()
                .sorted((o1,o2)->o1.getName().compareTo(o2.getName()))
                .collect(Collectors.toList());
        return hospitalList;
    }

    @Override
    public List<Hospital> getByCity(String city) throws HospitalNotFoundException {
        List<Hospital> hospitals = HospitalDetails.showHospitals();
        List<Hospital> hospitalByCity =hospitals.stream()
                .filter(book->book.getCity().startsWith(city))
                .sorted((o1,o2)->{
                    String category = o1.getCategory();
                    return category.compareTo(o2.getCategory());
                })
                .collect(Collectors.toList());

        if(hospitalByCity.isEmpty()) {
            throw new HospitalNotFoundException("Hospital by this city not found");
        }

        return hospitalByCity;
    }

    @Override
    public Hospital getById(int hospitalId) throws IdNotFoundException {
        List<Hospital> hospitals = HospitalDetails.showHospitals();
        Hospital hospitalById = hospitals.stream()
                .filter(book->book.getHospitalId()==hospitalId)
                .findFirst()
                .orElseThrow(()->new IdNotFoundException("Invalid id"));
        return hospitalById;
    }
}

