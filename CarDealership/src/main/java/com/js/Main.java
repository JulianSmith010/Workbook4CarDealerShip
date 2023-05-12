package com.js;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Vehicle truck1 = new Vehicle("Ford", "F-150", "Black", "Truck", 2019, 25000, 50500);
        Vehicle car1 = new Vehicle("Honda", "Civic", "Red", "Car", 2018, 35000, 25000);
        Vehicle car2 = new Vehicle("Toyota", "Camry", "White", "Car", 2020, 15000, 37000);
        Vehicle car3 = new Vehicle("Chevy", "Corvette", "Blue", "Car", 1019, 1000, 76000);
        Vehicle car4 =new Vehicle( "Chevrolet", "Camaro","Red" , "Car", 2021, 35000, 30000 );
        Vehicle car5 =new Vehicle( "Toyota", "Corolla", "Silver", "car",2018 , 20000,25000 );
        Vehicle car6 =new Vehicle( "Jeep", "Grand Cherokee", "White", "SUV",2017, 30000,75000 );
        Vehicle car7 =new Vehicle( "Nissan", "Frontier", "Gray", "Truck", 2009, 28000,500 );
        Vehicle car8 =new Vehicle( "Honda", "Civic", "Black", "Car", 2023, 15000, 88000);
        Vehicle car9 =new Vehicle( "Dodge", "Charger", "Green", "Car", 2022, 8000, 100000);
        Vehicle car10 =new Vehicle( "Ford", "Mustang", "Yellow", "Car", 2020, 25000,50000);
        Vehicle car11 =new Vehicle( "GMC", "Sierra 1500", "Blue", "Truck", 2016, 40000,40000 );
        Vehicle car12 =new Vehicle( "Chevrolet", "Tahoe", "Black", "SUV", 2012, 35000, 22000);
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

    public boolean removeVehicle(Object id) {
        return true;
    }

    public class DealershipApp {

        private static Scanner scanner = new Scanner(System.in);

        private void displayVehicles(List<Vehicle> vehiclesByColor){

            Dealership dealership = new Dealership();

            int choice = 0;
            do {
                System.out.println("Dealership Menu");
                System.out.println("1. Find vehicles within a price range");
                System.out.println("2. Find vehicles by make and model");
                System.out.println("3. Find vehicles by year range");
                System.out.println("4. Find vehicles by color");
                System.out.println("5. Find vehicles by mileage range");
                System.out.println("6. Find vehicles by type");
                System.out.println("7. List all vehicles");
                System.out.println("8. Add a vehicle");
                System.out.println("9. Remove a vehicle");
                System.out.println("99. Quit");

                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        // Find vehicles within a price range
                        double minPrice = 0;
                        double maxPrice = 0;
                        // Read min and max price values from user input
                        System.out.print("Enter minimum price: ");
                        minPrice = scanner.nextDouble();
                        System.out.print("Enter maximum price: ");
                        maxPrice = scanner.nextDouble();
                        // Call the dealership method to find matching vehicles and print the results
                        List<Vehicle> priceRangeVehicles = dealership.findVehiclesByPriceRange(minPrice, maxPrice);
                        for (Vehicle vehicle : priceRangeVehicles) {
                            System.out.println(vehicle.toString());
                        }
                        break;
                    case 2:
                        // Find vehicles by make and model
                        String make = "";
                        String model = "";
                        // Read make and model values from user input
                        System.out.print("Enter make: ");
                        make = scanner.nextLine();
                        System.out.print("Enter model: ");
                        model = scanner.nextLine();
                        // Call the dealership method to find matching vehicles and print the results
                        List<Vehicle> makeModelVehicles = dealership.findVehiclesByMakeAndModel(make, model);
                        for (Vehicle vehicle : makeModelVehicles) {
                            System.out.println(vehicle.toString());
                        }
                        break;
                    case 3:
                        // Find vehicles by year range
                        System.out.print("Enter minimum year: ");
                        Scanner input = null;
                        int minYear = input.nextInt();
                        System.out.print("Enter maximum year: ");
                        int maxYear = input.nextInt();
                        List<Vehicle> vehiclesByYearRange = dealership.findVehiclesByYearRange(minYear, maxYear);
                        displayVehicles(vehiclesByYearRange);
                        break;
                    case 4:
                        // Find vehicles by color
                        System.out.print("Enter color: ");
                        String color = input.next();
                        dealership.findVehiclesByColor(color);
                        displayVehicles(vehiclesByColor);
                        break;
                    case 5:
                        // Find vehicles by mileage range
                        System.out.print("Enter minimum mileage: ");
                        double minMileage = input.nextDouble();
                        System.out.print("Enter maximum mileage: ");
                        double maxMileage = input.nextDouble();
                        List<Vehicle> vehiclesByMileageRange = dealership.findVehiclesByMileageRange((int) minMileage, (int)maxMileage);
                        displayVehicles(vehiclesByMileageRange);
                        break;
                    case 6:
                        // Find vehicles by type
                        System.out.print("Enter type (car, truck, SUV, or Van): ");
                        String type = input.next();
                        List<Vehicle> vehiclesByType = dealership.findVehiclesByType(type);
                        displayVehicles(vehiclesByType);
                        break;
                    case 7:
                        // List all vehicles
                        List<Vehicle> allVehicles = dealership.getAllVehicles();
                        for (Vehicle vehicle : allVehicles) {
                            System.out.println(vehicle.toString());
                        }
                        break;
                    case 8:
                        // Add a vehicle
                        System.out.print("Enter make: ");
                        String newMake = input.next();
                        System.out.print("Enter model: ");
                        String newModel = input.next();
                        System.out.print("Enter year: ");
                        int newYear = input.nextInt();
                        System.out.print("Enter color: ");
                        String newColor = input.next();
                        System.out.print("Enter mileage: ");
                        double newMileage = input.nextDouble();
                        System.out.print("Enter price: ");
                        double newPrice = input.nextDouble();
                        System.out.print("Enter type (car, truck, SUV, or Van): ");
                        String newType = input.next();
                        Vehicle newVehicle = new Vehicle(newMake, newModel, newColor, newType, newYear, (int) newMileage, newPrice);
                        dealership.addVehicle(newVehicle);
                        System.out.println("Vehicle added.");
                        break;
                    case 9:
                        // Remove a vehicle
                        System.out.print("Enter vehicle ID: ");
                        int idToRemove = input.nextInt();
                        Vehicle vehicleToRemove = dealership.findVehicleById(idToRemove);
                        break;
                    case 99:
                        // Quit
                        System.out.println("Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }

            } while (choice != 99);
        }
    }


    }


