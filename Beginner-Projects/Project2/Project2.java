//package com.mycompany.project2;

import java.util.Scanner;

class car {
    String model;
    int year;
    double milage;
    
    car(String s, int y, double m){
        model = s;
        year = y;
        milage = m;
    }
    
    void carinfo(){
        System.out.println("Model : " + model);
        System.out.println("Year : " + year);
        System.out.println("Milage : " + milage);
    }
    
    String isClassicCar(){
        if(year >= 25 ){
            return "YES";
        }else{
            return "NO";
        }
    }
}

public class Project2 {

    public static void main(String[] args) {
        
        
        Scanner s1 = new Scanner(System.in);
        
        System.out.println("Enter 1st Car's Info : ");
        System.out.print("Car Name: ");
        String model = s1.nextLine();
        System.out.print("Car age: ");
        int year = s1.nextInt();
        System.out.print("Car Milage: ");
        double milage = s1.nextDouble();
        s1.nextLine();

        car c1 = new car(model, year, milage);

        Scanner s2 = new Scanner(System.in);
        
        System.out.println("Enter 2nd Car's Info: ");
        System.out.print("Car Name: ");
        String model1 = s2.nextLine();
        System.out.print("Car age: ");
        int year1 = s2.nextInt();
        System.out.print("Car Milage: ");
        double milage1 = s2.nextDouble();
        car c2 = new car(model1, year1, milage1);
        //s1.nextLine();
        
        System.out.println("\n" +c1.model + " INFO : ");
        c1.carinfo();
        System.out.println("Is " +c1.model + " Consider a Classic Car: " + c1.isClassicCar());
        
        System.out.println("\n" +c2.model + " INFO : ");
        c2.carinfo();
        System.out.println("Is " +c2.model + " Consider a Classic Car: " + c2.isClassicCar());
        
        
    }
}
