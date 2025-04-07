//package com.mycompany.oop;

class Teacher {
    
    //instance varibale declared inside a class (but outside the methods)
    //string name and string gender are instance varibale
    //not declared as static
    
    String name;
    String gender;
    
    //string uni is a static or class varibale 
    static String uni = "SEU";
    
    
    Teacher(String n, String g){
        //string n and string g are loacl varibale
        //local variable declared inside method, constructor or block
        
        name = n;
        gender = g;
    }
    
    void displayInfo(){
        System.out.println("Name : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Uni Name : " + uni);
        
    }
    
    
}

public class Oop {

    public static void main(String[] args) {
        Teacher t1 = new Teacher("Rahat", "male");
        Teacher t2 = new Teacher("Rakib", "male");
        
        t1.displayInfo();
        t2.displayInfo();
        
    }
}


    
    
