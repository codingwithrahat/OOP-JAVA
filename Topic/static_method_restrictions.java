//package com.mycompany.oop;

class Teacher {
    
    int x = 10;
    static int y = 10;
    
    void display1(){
        //we can call display2()
        display2();
        
        //we can print x and y from display1()
        //we can call any static or non static varibale or method from a non static method
        
        System.out.println("Iam non static method " + "value of x : " + x + " value of y : " + y );
    }
    
    static void display2(){
        //we can't call display1()
        //we can't print x from display2()
        //we can't call any non static method or varibale from a static method
        
        System.out.println("Iam static method " + "value of y : " + y );
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
