//package com.mycompany.oop;

interface Animal{
    String name = "Not Sure"; //by default public static final String
    
    void info(); //by default public abstract void 
}

//interface extends interface

interface Dog extends Animal{
    
    String name2 = "Tommy";

    void info2();
}

//class implements interface

class Info implements Dog{
    
    
    @Override
    public void info(){
        System.out.println("Name : " + name);
    }
    
    @Override
    public void info2(){
        System.out.println("Name : " + name2);
    }
}

public class Oop {

    public static void main(String[] args) {
        Info i1 = new Info();
        i1.info();
        i1.info2();
    }
}
