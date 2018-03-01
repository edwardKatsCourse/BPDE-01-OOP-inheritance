package com.company;

import com.company.vehicles.*;

public class VehicleApplication {
    public static void main(String[] args) {
        Vehicle privateCar = new PrivateCar("Seat", "Leon", 2017, 1);
        Vehicle leaseCar = new LeaseCar("BMW", "x6", 2018, 1);
        Vehicle truck = new Truck("Iveco", "Stralis", 2018, 2, 24000);
        Vehicle bike = new Bicycle("Ariel", "Cyclone", 1975, 100);

        Vehicle[] vehicles = {privateCar, leaseCar, truck, bike};

        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("Vehicle Type: " + vehicles[i].getVehicleType() + ", Brand:" + vehicles[i].getBrand());
            System.out.println("Services per year: " + vehicles[i].getServicesPerYear());

            if (vehicles[i] instanceof Car) {
                System.out.println("Car type: " + ((Car) vehicles[i]).getCarType());
            }

            if (vehicles[i] instanceof Truck) {
                System.out.println("Truck weight: " + ((Truck) vehicles[i]).getWeight());
            }

            System.out.println("---");
            System.out.println();
        }


    }
}
