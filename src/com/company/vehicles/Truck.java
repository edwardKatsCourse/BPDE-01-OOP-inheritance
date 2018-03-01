package com.company.vehicles;

public class Truck extends Vehicle {

    private int weight;

    public Truck(String brand, String model, int year, int servicesPerYear, int weight) {
        super(brand, model, year, servicesPerYear);
        this.weight = weight;
    }

    @Override
    public String getVehicleType() {
        return "TRUCK";
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
