package com.company.vehicles;

public abstract class Vehicle {

    private String brand;
    private String model;
    private int year;

    private int servicesPerYear;

    public Vehicle(String brand, String model, int year, int servicesPerYear) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.servicesPerYear = servicesPerYear;
    }

    public abstract String getVehicleType();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getServicesPerYear() {
        return servicesPerYear;
    }

    public void setServicesPerYear(int servicesPerYear) {
        this.servicesPerYear = servicesPerYear;
    }
}
