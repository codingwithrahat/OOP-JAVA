//package com.mycompany.oop;

//Multilevel Inheritance

class Animal {
    void eat(){
        System.out.println("Animal is eating");
    }
                
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking");
    }
}

class Tommy extends Dog{
    void run(){
        System.out.println("Tommy is running");
    }
}

public class Oop {

    public static void main(String[] args) {
        Tommy t1 = new Tommy();
        t1.eat();
        t1.bark();
        t1.run();
    }
}
