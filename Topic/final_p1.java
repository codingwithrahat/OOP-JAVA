//package com.mycompany.oop;

class Teacher {
    
    final String NAME = "Rahat";
    final String GENDER; // blank final varibale
    static String SUB; //static blank final variable
    int phn = 18;
    
    
    Teacher(){
        GENDER = "male";
    }
    
    static{
        // need a block for initialize
        SUB = "CSE";
    }
 
    void displayInfo(){

        phn = 21; // can modify
        System.out.println("Name : " + NAME);
        System.out.println("Gender : " + GENDER);
        System.out.println("Subject : " + SUB);
        System.out.println("Phn : " + phn);
        
    }
    
    
}

public class Oop {

    public static void main(String[] args) {
        Teacher t1 = new Teacher();

        
        t1.displayInfo();

        
    }
}
