//package com.mycompany.oop;

//Heirarchical Inheritance

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

class Cat extends Animal{
    void meow(){
        System.out.println("Cat is meowing");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Bird is flying");
    }
}

public class Oop {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();
        d1.bark();
        
        Cat c1 = new Cat();
        c1.meow();
        
        Bird b1 = new Bird();
        b1.fly();
    }
}
