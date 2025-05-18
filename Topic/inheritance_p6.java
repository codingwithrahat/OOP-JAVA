//package com.mycompany.oop;

//Multiple Inheritance

interface Person {
    void info_p();
                
}

class Student {
    void info_s(){
        System.out.println("Rahat is a Student");
    }
                
}

class Rahat extends Student implements Person{
    @Override
    public void info_p(){
        System.out.println("Rahat is a Person");
    }
 
}

public class Oop {

    public static void main(String[] args) {
        Rahat r1 = new Rahat();
        
        r1.info_p();
        r1.info_s();
    }
}
