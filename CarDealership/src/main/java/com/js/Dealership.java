package com.js;

import java.util.ArrayList;
import java.util.List;

class Dealership{
   private String name;
    private ArrayList<Vehicle> inventory;
        private FileManager fileManager;

        public Dealership(FileManager fileManager) {
            this.fileManager = fileManager;
        }

        public List<Vehicle> findVehiclesByPriceRange(double minPrice, double maxPrice) {
            List<Vehicle> vehicles = fileManager.getAllVehicles();
            List<Vehicle> matchingVehicles = new ArrayList<>();

            for (Vehicle vehicle : vehicles) {
                List<Vehicle> Vehicles = fileManager.getAllVehicles();
                List<Vehicle> MatchingVehicles = new ArrayList<>();

                for (Vehicle Vehicle : vehicles) {
                    if (vehicle.getPrice() >= minPrice) {
                        if (vehicle.getPrice() <= maxPrice) {
                            matchingVehicles.add(vehicle);
                        }
                    }
                }
            }


            return matchingVehicles;
        }


        public List<Vehicle> findVehiclesByMakeAndModel(String make, String model) {
            List<Vehicle> vehicles = fileManager.getAllVehicles();
            List<Vehicle> matchingVehicles = new ArrayList<>();

            for (Vehicle vehicle : vehicles) {
                if (vehicle.getModel().equalsIgnoreCase(model)) {
                    matchingVehicles.add(vehicle);
                }
            }
            return matchingVehicles;
        }
        public List<Vehicle> findVehiclesByYearRange(int minYear, int maxYear) {
        List<Vehicle> vehicles = fileManager.getAllVehicles();
        List<Vehicle> matchingVehicles = new ArrayList<>();

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getYear() >= minYear && vehicle.getYear() <= maxYear) {
                matchingVehicles.add(vehicle);
            }
        }

        return matchingVehicles;

        }

        public List<Vehicle> findVehiclesByColor(String color) {
        List<Vehicle> vehicles = fileManager.getAllVehicles();
        List<Vehicle> matchingVehicles = new ArrayList<>();

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getColor().equalsIgnoreCase(color)) {
                matchingVehicles.add(vehicle);
            }
        }

        return matchingVehicles;
        }

    public List<Vehicle> findVehiclesByMileageRange(int minMileage, int maxMileage) {
        List<Vehicle> vehicles = fileManager.getAllVehicles();
        List<Vehicle> matchingVehicles = new ArrayList<>();

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getMileage() >= minMileage && vehicle.getMileage() <= maxMileage) {
                matchingVehicles.add(vehicle);
            }
        }

        return matchingVehicles;
        }

    public List<Vehicle> findVehiclesByType(String type) {
        List<Vehicle> vehicles = fileManager.getAllVehicles();
        List<Vehicle> matchingVehicles = new ArrayList<>();

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getType().equalsIgnoreCase(type)) {
                matchingVehicles.add(vehicle);
            }
        }

        return matchingVehicles;

        }

        public List<Vehicle> getAllVehicles() {
        return fileManager.getAllVehicles();
        }


        public boolean addVehicle(Vehicle vehicle) {
            boolean added = fileManager.addVehicle(vehicle);

            if (added) {
                System.out.println("Vehicle added successfully.");
            } else {
                System.out.println("Failed to add vehicle.");
            }
            return added;
        }

        public boolean removeVehicle(Vehicle vehicle) {
            boolean removed = fileManager.removeVehicle(id);

            if (removed) {
                System.out.println("Vehicle removed successfully.");
            } else {
                System.out.println("Failed to remove vehicle.");
            }

            return removed;
        }
    }


