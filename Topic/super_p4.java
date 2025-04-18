//package com.mycompany.oop;

class Person {
    String name;
    String gender;
    
    Person(String n, String g){
        name = n;
        gender = g;
    }
    
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        
    }
}

class Teacher extends Person {
  
    int age;
    
    Teacher(String n, String g, int a){
        super(n, g);
        age = a;
    }
    
    @Override
    void display(){
        super.display();
        System.out.println("Age: " + age);
        
    }
    
}

public class Oop {

    public static void main(String[] args) {
        Teacher t1 = new Teacher("Rahat", "male", 18);
        Person p1 = new Person("Rakib", "Male");
        
        t1.display();
        p1.display();
            
    }
}
