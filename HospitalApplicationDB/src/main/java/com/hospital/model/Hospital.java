package com.hospital.model;

public class Hospital {
    private String name;
    private Integer hospitalId;
    private String city;
    private String state;
    private String category;

    public Hospital() {
        super();
    }

    public Hospital(String name, Integer hospitalId, String city, String state, String category) {
        this.name = name;
        this.hospitalId = hospitalId;
        this.city = city;
        this.state = state;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Integer hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "name='" + name + '\'' +
                ", hospitalId=" + hospitalId +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
