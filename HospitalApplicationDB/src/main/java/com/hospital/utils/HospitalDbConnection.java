package com.hospital.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HospitalDbConnection {
static Connection connection;
    public static Connection openConnection() {
        String url = "jdbc:mysql://localhost:3306/trainingdemo";
        String user = "root";
        String pass = "root";
        try{
            connection = DriverManager.getConnection(url, user, pass);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }

    public static void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
