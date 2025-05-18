//package com.mycompany.oop;

interface Animal{
    String name = "Not Sure"; //by default public static final String
    
    void info(); //by default public abstract void 
}

class Dog implements Animal{
    
    @Override
    public void info(){
        System.out.println("Name : " + name);
    }
}

public class Oop {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.info();
    }
}
