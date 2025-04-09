//package com.mycompany.oop;

class Overload{
    
    void add(){
        System.out.println("Nothing to add");
    }
    void add(int a, int b){
        System.out.println("sum : " + (a + b));
    }
    void add(double a, double b, double c){
        System.out.println("sum : " + (a + b + c));
    }
}

public class Oop {

    public static void main(String[] args) {
        Overload o1 = new Overload();
        
        o1.add();
        o1.add(1 , 2);
        o1.add(1.2 , 1.2 , 4.2);
    }
}
