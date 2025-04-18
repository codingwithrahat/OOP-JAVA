//package com.mycompany.oop;

class Person {
    
    void run(){
        System.out.println("Inside Person Class");
    }
}

class Teacher extends Person {
  
    void run(){
        super.run();
        System.out.println("Inside Teacher Class");
    }
    
    
}

public class Oop {

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        
        t1.run();
        
    }
}
