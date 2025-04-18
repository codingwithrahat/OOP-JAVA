//package com.mycompany.oop;

class Person {
    
    Person(){
        System.out.println("Inside Person Constructor");
    }
}

class Teacher extends Person {
  
    Teacher(){
        super();
        System.out.println("Inside Teacher Constructor");
    }
    
    
}

public class Oop {

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        
        
    }
}
