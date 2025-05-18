//package com.mycompany.oop;

//Multiple Inheritance

interface Person {
    void info_p();
                
}

interface Student {
    void info_s();
                
}

class Rahat implements Person, Student{
    @Override
    public void info_p(){
        System.out.println("Rahat is a Person");
    }
    
    @Override
    public void info_s(){
        System.out.println("Rahat is a Student");
    }
    
    
    
}

public class Oop {

    public static void main(String[] args) {
        Rahat r1 = new Rahat();
        
        r1.info_p();
        r1.info_s();
    }
}
