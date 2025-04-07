//package com.mycompany.oop;

class Teacher {
    
    static String name;
    static String id;
    
    static{
        name = "Rahat";
        id = "123";
    }
    
    static void display(){
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        
    }
}

public class Oop {

    public static void main(String[] args) {
        Teacher.display();
        
   
    }
}
