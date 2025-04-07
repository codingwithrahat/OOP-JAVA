//package com.mycompany.oop;

public class Oop {
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
    public static void main(String[] args) {
        Oop.display();
        
   
    }
}
