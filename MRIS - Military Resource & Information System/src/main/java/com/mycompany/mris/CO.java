
package com.mycompany.mris;

public class CO extends Person{
    
    int salary = 30000;
    
    CO(String id, String name, int age, String rank){
        super(id, name, age, rank);
    }
    
    @Override
    void displayRole(){
        System.out.println("Commission Officer - Mission & Operation");
    }
    
    @Override
    void calculateSalary(){
        if(rank == "Major"){
            salary = salary + 10000;
        }else if(rank == "General"){
            salary = salary + 20000;
        }
        System.out.println("Your Montly Slary : " + salary);
    }

}
