//package com.mycompany.oop;

class Person {
    String name;
    String gender;
    
    void displayPerson(){
        System.out.println("Person Info: ");
        System.out.println("Name : " + name);
        System.out.println("Gender : " + gender);
    }
}

class Teacher extends Person {
    
    //name
    //gender
    int phn;

    void displayInfo(){
        
        displayPerson();
        System.out.println("Phn : " + phn);
        
    }
    
    
}

public class Oop {

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher();
        
        t1.name = "Rahat";
        t1.gender = "male";
        t1.phn = 18;
        t2.name = "Rakib";
        t2.gender = "male";
        t2.phn = 13;
        

        
        t1.displayInfo();
        t2.displayInfo();
        
    }
}
