//package com.mycompany.oop;

class Teacher {
    
    void display1(){
        System.out.println("Iam non static method");
    }
    
    static void display2(){
        System.out.println("Iam static method");
    }
    
}

public class Oop {

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.display1();
        //call from object t1
        
        Teacher.display2();
        //call from class Teacher
        
   
    }
}
