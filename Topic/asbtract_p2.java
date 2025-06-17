//package com.mycompany.oop;

abstract class person{

    int a; // non final
    final int b = 3; // final
        
    person(int a){
        this.a = a;
    }

    abstract void displaya(); 
    
    void displayb(){
        System.out.println(b);
    }
    
}

class stu extends person{
    
    stu(int a){
        super(a);
    }
    
    @Override
    void displaya(){
        System.out.println(a);
    }
}

public class Oop {
    
    public static void main(String[] args){
        
        stu s1 = new stu(10);
        
        s1.displaya();
        s1.displayb();
        
    }
}
