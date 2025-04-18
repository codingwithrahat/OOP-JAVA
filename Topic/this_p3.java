//package com.mycompany.oop;

class Teacher {
    String name;
    String gender;
    int phn;
    
    Teacher(String name, String gender){
        this.name = name;
        this.gender = gender;
    }
    
    Teacher(String name, String gender, int phn){
        this(name, gender);
        this.phn = phn;
    }
    
    void run(){
        System.out.println("Info: ");
    }
    
    
    void displayInfo(){
        this.run();
        //run() same result
        System.out.println("Name : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Phn : " + phn);
        
    }
    
    
}

public class Oop {

    public static void main(String[] args) {
        Teacher t1 = new Teacher("Rahat", "male", 18);
        Teacher t2 = new Teacher("Rakib", "male");
        
        t1.displayInfo();
        t2.displayInfo();
        
    }
}
