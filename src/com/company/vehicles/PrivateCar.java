package com.company.vehicles;

public class PrivateCar extends Car {

    private static final String CAR_TYPE = "private";

    public PrivateCar(String brand, String model, int year, int servicesPerYear) {
        super(brand, model, year, servicesPerYear, CAR_TYPE);
    }
}
