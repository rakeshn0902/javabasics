package com.hospital.service;

import com.hospital.dao.IHospitalDao;
import com.hospital.dao.IHospitalServiceDaoImpl;
import com.hospital.exception.HospitalNotFoundException;
import com.hospital.model.Hospital;

import java.awt.print.Book;
import java.util.List;

public class HospitalServiceImpl implements IHospitalService {

	private IHospitalDao hospitalDao = new IHospitalServiceDaoImpl();

	@Override
	public List<Hospital> getHospitals() throws HospitalNotFoundException {
		List<Hospital> hospitals = hospitalDao.getHospitals();
		return hospitals;
	}

	@Override
	public void registerHospital(Hospital hospital) {
		hospitalDao.registerHospital(hospital);
	}


}
