//package com.mycompany.project10;

abstract class Person {
    String name;
    String id;
    
    Person(String name, String id){
        this.name = name;
        this.id = id;
    }
    
    abstract void getRole();
}

class Product {
    String product_id;
    String name;
    double price;
    
    Product(String product_id, String name, double price){
        this.product_id = product_id;
        this.name = name;
        this.price = price;
    }
    
    
    void displayProductInfo(){
        System.out.println("ID " + product_id);
        System.out.println("Name " + name);
        System.out.println("Price " + price);
        
    }
}

interface Purchasable {
    void purchase(String item, double price);
}

class Employee extends Person{
    String position;
    
    Employee(String name, String id, String position){
        super(name, id);
        this.position = position;
    }
    
    @Override
    void getRole(){
        System.out.println("Contragtulation You are now assign as " + position + ".");
    }
}


class Customer extends Person implements Purchasable{
    double balance;
    
    
    Customer(String name, String id, double balance){
        super(name, id);
        this.balance = balance;
    }
    
    @Override
    void getRole(){
        System.out.println("Thanks For be with us.");
    }
    
    @Override
    public void purchase(String item, double price){
        System.out.println("Purschase " + item);
        System.out.println("New Balance " + (balance - price));
        
    }
}

public class Project10 {

    public static void main(String[] args) {
        
        Product p1 = new Product("01","Apple", 12.4);
        Product p2 = new Product("02", "Vagitable", 15.6);
        
        p1.displayProductInfo();
        p2.displayProductInfo();
        
        Customer c1 = new Customer("Rahat", "527", 30.4);
        Employee e1 = new Employee("Rakib", "2", "Senior Officer");
        
        c1.purchase("Vagitable", 12.3);
        c1.getRole();
        e1.getRole();
        
        
        
    }
}
