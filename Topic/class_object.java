package com.mycompany.oop;

class Teacher {
    String name;
    String gender;
    int phn;
}

public class Oop {

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher();
        
        t1.name = "Rahat";
        t1.gender = "male";
        t1.phn = 18;
        
        t2.name = "Rakib";
        t2.gender = "male";
        t2.phn = 13;
        
        System.out.println(t1.name +" "+ t1.gender + " " + t1.phn);
        System.out.println(t2.name +" " + t2.gender + " " + t2.phn);
        
    }
}
