
package com.mycompany.mris;

public class ArtilleryCrops extends CO{
    String FieldType;
    
    ArtilleryCrops(String id, String name, int age, String rank, String FieldType){
        super(id, name, age, rank);
        this.FieldType = FieldType;
    }
    
    @Override
    void displayRole(){
        System.out.println("Artillery Commision Officer - Field : " + FieldType);
    }
    
    @Override
    void calculateSalary(){
        super.calculateSalary();
        if(FieldType == "Air Defense"){
            salary = salary + 5000;
        }else if(FieldType == "Field Artillery"){
            salary = salary + 7000;
        }
        System.out.println("Your Salary With Commission : " + salary);
    }
    
}
