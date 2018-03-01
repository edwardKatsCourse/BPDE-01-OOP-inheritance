package com.company.vehicles;

public class LeaseCar extends Car {

    private static final String LEASE_CAR = "lease";

    public LeaseCar(String brand, String model, int year, int servicesPerYear) {
        super(brand, model, year, servicesPerYear, LEASE_CAR);
    }

    @Override
    public int getServicesPerYear() {
        return super.getServicesPerYear() * 2;
    }
}
