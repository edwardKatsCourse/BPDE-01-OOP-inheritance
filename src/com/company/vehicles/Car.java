package com.company.vehicles;

public class Car extends Vehicle {

    private String carType;

    public Car(String brand, String model, int year, int servicesPerYear, String type) {
        super(brand, model, year, servicesPerYear);
        this.carType = type;
    }



    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String getVehicleType() {
        return "CAR";
    }

    @Override
    public int getServicesPerYear() {
        return this.carType.equalsIgnoreCase("private") ? 1 : 2;
    }
}
