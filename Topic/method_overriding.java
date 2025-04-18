//package com.mycompany.oop;

class Person {
    String name;
    String gender;
    
    void displayInfo(){
        System.out.println("Person Info: ");
        System.out.println("Name : " + name);
        System.out.println("Gender : " + gender);
    }
}

class Teacher extends Person {
    
    int phn;

    void displayInfo(){
        
        System.out.println("Person Info: ");
        System.out.println("Name : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Phn : " + phn);
        
    }
    
    
}

public class Oop {

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        Person p1 = new Person();
        
        t1.name = "Rahat";
        t1.gender = "male";
        t1.phn = 18;
        
        p1.name = "Rakib";
        p1.gender = "male";
       
        t1.displayInfo();
        p1.displayInfo();
        
    }
}
