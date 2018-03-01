package com.company.vehicles;

public class Bicycle extends Vehicle {

    public Bicycle(String brand, String model, int year, int servicesPerYear) {
        super(brand, model, year, servicesPerYear);
    }

    @Override
    public String getVehicleType() {
        return "BICYCLE";
    }
}
