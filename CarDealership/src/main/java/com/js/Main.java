package com.js;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Vehicle truck1 = new Vehicle("Ford", "F-150", "Black", "Truck", 2019, 25000, 50500);
        Vehicle car1 = new Vehicle("Honda", "Civic", "Red", "Car", 2018, 35000, 25000);
        Vehicle car2 = new Vehicle("Toyota", "Camry", "White", "Car", 2020, 15000, 37000);
        Vehicle car3 = new Vehicle("Chevy", "Corvette", "Blue", "Car", 1019, 1000, 76000);

    }
}
class Vehicle{
    private String make;
    private String model;
    private String color;
    private String type;
    private int year;
    private int mileage;
    private double price;

    public Vehicle(String make, String model, String color, String type, int year, int mileage, double price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.type = type;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
class FileManager{
    private String filepath;

    public FileManager(String filePath) {
        this.filepath = filePath;
    }

    public List<Vehicle> getAllVehicles() {
        return null;
    }

    public boolean addVehicle(Vehicle vehicle) {
        return true;
    }
}

