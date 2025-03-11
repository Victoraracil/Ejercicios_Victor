package garage.classes;

import java.util.*;

// Abstract Vehicle class
abstract class Vehicle {
    protected String licensePlate;
    protected String brand;
    protected String model;
    protected String color;

    public Vehicle(String licensePlate, String brand, String model, String color) {
        if (!licensePlate.matches("\\d{4}[A-Z]{3}")) {
            throw new IllegalArgumentException("Invalid license plate format. Must be 4 numbers followed by 3 letters.");
        }
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public String getLicensePlate() { return licensePlate; }
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public String getColor() { return color; }

    @Override
    public String toString() {
        return brand + " " + model + " (" + color + ") - " + licensePlate;
    }
}

// Car class
class Car extends Vehicle {
    private String fuelType;

    public Car(String licensePlate, String brand, String model, String color, String fuelType) {
        super(licensePlate, brand, model, color);
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return super.toString() + " - Fuel: " + fuelType;
    }
}

// Motorcycle class
class Motorcycle extends Vehicle {
    private int cylinderCapacity;

    public Motorcycle(String licensePlate, String brand, String model, String color, int cylinderCapacity) {
        super(licensePlate, brand, model, color);
        this.cylinderCapacity = cylinderCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + " - Cylinder Capacity: " + cylinderCapacity + "cc";
    }
}

// Replacement Part
class ReplacementPart {
    private String name;
    private double price;

    public ReplacementPart(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return name + " - " + price + " EUR";
    }
}

// Repair Order
class RepairOrder {
    private Vehicle vehicle;
    private String problemDescription;
    private List<ReplacementPart> replacementParts;
    private int workingHours;

    public RepairOrder(Vehicle vehicle, String problemDescription) {
        this.vehicle = vehicle;
        this.problemDescription = problemDescription;
        this.replacementParts = new ArrayList<>();
        this.workingHours = 0;
    }

    public void addReplacementPart(ReplacementPart part) {
        replacementParts.add(part);
    }

    public void addWorkingHours(int hours) {
        this.workingHours += hours;
    }

    public double calculateTotalCost() {
        double partsCost = replacementParts.stream().mapToDouble(ReplacementPart::getPrice).sum();
        return partsCost + (workingHours * 50);
    }

    public List<ReplacementPart> getReplacementParts() {
        return replacementParts;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    @Override
    public String toString() {
        return "Vehicle: " + vehicle + "\nProblem: " + problemDescription + "\nHours: " + workingHours + "\nTotal: " + calculateTotalCost() + " EUR";
    }
}

// Garage Management
class GarageManager {
    private Map<String, RepairOrder> repairOrders = new HashMap<>();

    public void addRepairOrder(RepairOrder order) {
        repairOrders.put(order.getVehicle().getLicensePlate(), order);
    }

    public RepairOrder searchVehicle(String licensePlate) {
        return repairOrders.get(licensePlate);
    }

    public void displayStatistics() {
        System.out.println("Total Repair Orders: " + repairOrders.size());
        double totalRevenue = repairOrders.values().stream().mapToDouble(RepairOrder::calculateTotalCost).sum();
        System.out.println("Total Revenue: " + totalRevenue + " EUR");

        Map<String, Integer> partCount = new HashMap<>();
        for (RepairOrder order : repairOrders.values()) {
            for (ReplacementPart part : order.getReplacementParts()) {
                partCount.put(part.getName(), partCount.getOrDefault(part.getName(), 0) + 1);
            }
        }

        String mostCommonPart = partCount.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("None");
        System.out.println("Most Common Replacement Part: " + mostCommonPart);
    }
}
}