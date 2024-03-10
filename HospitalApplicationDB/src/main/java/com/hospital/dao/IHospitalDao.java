package com.hospital.dao;

import com.hospital.model.Hospital;

import java.util.List;

public interface IHospitalDao {
 List<Hospital> getHospitals();
 void registerHospital(Hospital hospital);

}
