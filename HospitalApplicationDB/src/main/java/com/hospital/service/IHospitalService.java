package com.hospital.service;


import com.hospital.exception.HospitalNotFoundException;
import com.hospital.model.Hospital;

import java.util.List;

public interface IHospitalService {

    List<Hospital> getHospitals() throws HospitalNotFoundException;
    void registerHospital(Hospital hospital);
}
