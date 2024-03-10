package com.hospital.dao;

import com.hospital.model.Hospital;
import com.hospital.utils.HospitalDbConnection;
import com.hospital.utils.Queries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class IHospitalServiceDaoImpl implements IHospitalDao {
    @Override
    public void registerHospital(Hospital hospital) {
        try (Connection connection = HospitalDbConnection.openConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.insertQuery)) { // create a prepared
            // statement
            statement.setInt(1, hospital.getHospitalId()); // set the values for placeholder
            statement.setString(2, hospital.getName());
            statement.setString(3, hospital.getCity());
            statement.setString(4, hospital.getState());
            statement.setString(5, hospital.getCategory());
            statement.execute(); // execute the query
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    @Override
    public List<Hospital> getHospitals() {
        List<Hospital> hospitals = new ArrayList<>();
        try(Connection connection = HospitalDbConnection.openConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(Queries.selectQuery);
            ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()){
                Hospital hospital = new Hospital();
                hospital.setHospitalId(resultSet.getInt("hospitalId"));
                hospital.setName(resultSet.getString("name"));
                hospital.setCity(resultSet.getString("city"));
                hospital.setState(resultSet.getString("state"));
                hospital.setCategory(resultSet.getString("category"));
                hospitals.add(hospital);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return hospitals;
    }

}
