//package com.mycompany.oop;

class Person {
    int x = 10;
}

class Teacher extends Person {
    //x = 10
    int x = 5; //get more priority

    void displayInfo(){
        
        System.out.println(x);
        System.out.println(super.x);
       
    }
    
    
}

public class Oop {

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        
        t1.displayInfo();
        
    }
}
