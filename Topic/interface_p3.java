//package com.mycompany.oop;

interface Animal {
    void info_A();
                
}

interface Dog {
    void info_D();
                
}

class Puppy {
    void info_P(){
        System.out.println("Tommy is a Puppy");
    }
}

//In java, a class can extend one class,
//but a class can implement multiple interfaces.
//This is called multiple inheritance.

class Tommy extends Puppy implements Animal, Dog{
    @Override
    public void info_A(){
        System.out.println("Tommy is an Animal");
    }
    
    @Override
    public void info_D(){
        System.out.println("Tommy is a Dog");
    }
    
 
}

public class Oop {

    public static void main(String[] args) {
        Tommy t1 = new Tommy();
        
        t1.info_A();
        t1.info_D();
        t1.info_P();
    }
}
