
package com.mycompany.mris;

public class EngineerCorps extends CO {
    
    String EngineeringField;
    
    EngineerCorps(String id, String name, int age, String rank, String EngineeringField){
        super(id, name, age, rank);
        this.EngineeringField = EngineeringField;
    }
    
    @Override
    void displayRole(){
        System.out.println("Engineer Commision Officer - Feild : " + EngineeringField);
    }
    
    @Override
    void calculateSalary(){
        super.calculateSalary();
        if(EngineeringField == "Mechanical Divison"){
            salary = salary + 5000;
        }else if(EngineeringField == "IT Divison"){
            salary = salary + 7000;
        }
        System.out.println("Your Salary With Commission : " + salary);
    }
}
