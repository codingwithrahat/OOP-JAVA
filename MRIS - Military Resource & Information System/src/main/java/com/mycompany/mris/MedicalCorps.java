
package com.mycompany.mris;

public class MedicalCorps extends CO{
    String medicalSpecialty;
    
    MedicalCorps(String id, String name, int age, String rank, String medicalSpecialty){
        super(id, name, age, rank);
        this.medicalSpecialty = medicalSpecialty;
    }
    
    @Override
    void displayRole(){
        System.out.println("Medical Commision Officer - Speciality : " + medicalSpecialty);
    }
    
    @Override
    void calculateSalary(){
        super.calculateSalary();
        if(medicalSpecialty == "Field Physician"){
            salary = salary + 5000;
        }else if(medicalSpecialty == "Medicine Officer"){
            salary = salary + 7000;
        }
        System.out.println("Your Salary with Comimssion : " + salary);
    }
  
}
