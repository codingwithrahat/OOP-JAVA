//package com.mycompany.oop;

//Single Inheritance

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

public class Oop {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();
        d1.bark();
    }
}
