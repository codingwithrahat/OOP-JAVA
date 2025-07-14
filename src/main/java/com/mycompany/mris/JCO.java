package com.mycompany.mris;

public class JCO extends Person{
 
    int salary = 20000;
    
    JCO(String id, String name, int age, String rank){
        super(id, name, age, rank);
    }
    
    @Override
    void displayRole(){
        System.out.println("Junnior Commission Officer - Supervise Field Operation");
    }
    
    @Override
    void calculateSalary(){
        if(rank == "Warrent Officer"){
            salary = salary + 5000;
        }else if(rank == "Senior Warrent Officer"){
            salary = salary + 10000;
        }
        System.out.println("Your Montly Slary : " + salary);
    }
  
}
