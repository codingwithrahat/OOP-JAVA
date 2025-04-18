//package com.mycompany.oop;

class Teacher {
    String name;
    String gender;
    int phn;
    
    
    Teacher(String name, String gender, int phn){
        this.name = name;
        this.gender = gender;
        this.phn = phn;
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
        Teacher t2 = new Teacher("Rakib", "male", 13);
        
        t1.displayInfo();
        t2.displayInfo();
        
    }
}
