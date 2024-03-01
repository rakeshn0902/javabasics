package com.hospital.service;

import com.hospital.exception.HospitalNotFoundException;
import com.hospital.exception.IdNotFoundException;
import com.hospital.model.Hospital;

import java.util.List;

public interface HospitalInterface {

    List<Hospital> getAll() throws HospitalNotFoundException;
    List<Hospital> getByCity(String city) throws HospitalNotFoundException;
    Hospital getById(int hospitalId) throws IdNotFoundException;


}
