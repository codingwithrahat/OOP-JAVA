//package com.mycompany.oop;

class Teacher {
    
    int count = 0;
    static int count2 = 0;
    
    Teacher(){
        count++;
        count2++;
    }
  
    void totalTeacher(){
        System.out.println("Total Teacher : " + count);
        System.out.println("Total Teacher : " + count2);
        
    }
    
}

public class Oop {

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.totalTeacher();
        
        Teacher t2 = new Teacher();
        t2.totalTeacher();
        
        Teacher t3 = new Teacher();
        t3.totalTeacher();
        
        
        
        //diff between normal varibale and static variable
        //normal variable create separate memory for every object
        //so count always 1 but in static coun2 is increase
    }
}
