package com.hospital.utils;

public class Queries {

public static final String insertQuery =
        "INSERT INTO Hospital(hospitalId,name,city,state,category) VALUES(?,?,?,?,?)";
public static final String selectQuery =
        "SELECT * FROM Hospital";

}
