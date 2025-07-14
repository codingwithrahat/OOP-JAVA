
package com.mycompany.mris;

public class NCO extends Person{

    int salary = 10000;
 
    NCO(String id, String name, int age, String rank){
        super(id, name, age, rank);
    }
    
    @Override
    void displayRole(){
        System.out.println("Non Commission Officer - Execute Ground Level Operation");
    }
    
    @Override
    void calculateSalary(){
        if(rank == "Corporal"){
            salary = salary + 500;
        }else if(rank == "Sergent"){
            salary = salary + 1000;
        }
        System.out.println("Your Montly Slary : " + salary);
    }

}
