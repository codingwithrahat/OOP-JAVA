//package com.mycompany.oop;

abstract class mobileUser{
    abstract void sendMssg();
}

class rahat extends mobileUser{
    // must create a override method
    
    @Override
    void sendMssg(){
        System.out.println("Hi, This is Rahat");
    }
}

class rakib extends mobileUser{
    // must create a override method
    
    @Override
    void sendMssg(){
        System.out.println("Hi, This is Rakib");
    }
}

public class Oop {

    public static void main(String[] args) {
        mobileUser m;
        //abstract class can't create as a object
        
        m = new rahat();
        m.sendMssg();
        
        m = new rakib();
        m.sendMssg();

    }
}
