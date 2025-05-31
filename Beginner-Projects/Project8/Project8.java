//package com.mycompany.project8;

class Vehicle {
    String vehicle_id, model;
    int capacity;
    
    Vehicle(String vehicle_id, String model, int capacity){
        this.vehicle_id = vehicle_id;
        this.model = model;
        this.capacity = capacity;
    }
    
}

class Driver {
    String driver_id, name;
    int rating;
    
    Driver(String driver_id, String name, int rating){
        this.driver_id = driver_id;
        this.name = name;
        this.rating = rating;
    }
}

interface RideInterface {
    void start_ride();
    void end_ride();
}

interface PaymentHandler {
    void calculate_payment();
}

class Car extends Vehicle implements RideInterface{
    
    Car(String vehicle_id, String model, int capacity){
        super(vehicle_id, model, capacity);
    }
    
    
    void car_info(){
        System.out.println("ID: " + vehicle_id);
        System.out.println("Model: " + model);
        System.out.println("Capacity: " + capacity);
        
    }
    
    
    
    @Override
    public void start_ride(){
        System.out.println("Your Car Name is " + model);
    } 
    
    @Override
    public void end_ride(){
       System.out.println("Thanks for the Car ride"); 
    }
}
class Bike implements RideInterface{
    @Override
    public void start_ride(){
        System.out.println("Your Bike will arive soon");
    } 
    
    @Override
    public void end_ride(){
        System.out.println("Thanks for the Bike ride"); 
    }
}

class ContractDriver extends Driver implements PaymentHandler {
    
    ContractDriver(String driver_id, String name, int rating){
        super(driver_id, name, rating);
    }
    
    
    @Override
    public void calculate_payment(){
        System.out.println("You Payment is 1000 Tk");
    }
}

class PremiumCar extends Car{
    
    PremiumCar(String vehicle_id, String model, int capacity){
        super(vehicle_id, model, capacity);
    }
    void luxury_features(){
        System.out.println("This car has more capacity than a regular car");
        System.out.println("Capacity:" + capacity);
        
    }
}


public class Project8 {

    public static void main(String[] args) {
        Car c1 = new Car("203", "BMW", 3);
        Bike b1 = new Bike();
        PremiumCar pc1 = new PremiumCar("302", "ODDI", 5);
        ContractDriver d1 = new ContractDriver("402", "Akash", 5);
        
        c1.car_info();
        c1.start_ride();
        c1.end_ride();
        b1.start_ride();
        b1.end_ride();
        pc1.luxury_features();
        d1.calculate_payment();
        
    }
}
