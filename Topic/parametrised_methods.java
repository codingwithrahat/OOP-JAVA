//package com.mycompany.oop;

class Teacher {
    String name;
    String gender;
    int phn;
    
    
    void setInfo(String n, String g, int p){
        name = n;
        gender = g;
        phn = p;
    }
    
    void displayInfo(){
        System.out.println("Name : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Phn : " + phn);
        
    }
    
    
}

public class Oop {

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher();
        
        
        t1.setInfo("Rahat", "male", 18);
        t2.setInfo("Rakib", "male", 13);
      
        
        t1.displayInfo();
        t2.displayInfo();
        
    }
}
