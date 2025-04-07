//package com.mycompany.oop;

class Teacher {
    String name;
    String gender;
    static String uni = "SEU";
    
    
    Teacher(String n, String g){
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
