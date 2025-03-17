//package com.mycompany.oop;


class Teacher {
    String name;
    String gender;
    int phn;
    
    
    Teacher(String n, String g, int p){
        name = n;
        gender = g;
        phn = p;
    }
    
    Teacher(String n, String g){
        name = n;
        gender = g;
    }
    
    Teacher(){
        System.out.println("No Information");
    }
    
    void displayInfo(){
        System.out.println("Name : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Phn : " + phn);
        
    }
    
    
}

public class Oop {

    public static void main(String[] args) {
        Teacher t1 = new Teacher("Rahat", "male", 18);
        Teacher t2 = new Teacher("Rakib", "male");
        Teacher t3 = new Teacher();
        
        
        t1.displayInfo();
        t2.displayInfo();
        t3.displayInfo();
        
    }
}
