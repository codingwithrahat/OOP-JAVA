//package com.mycompany.oop;

class A extends Thread{

    @Override
    public void run(){
        for(int i = 1; i<=5; i++){
            System.out.println("Thread A : " + i);
        }
    }
}

class B extends Thread{

    @Override
    public void run(){
        for(int i = 1; i<=5; i++){
            System.out.println("Thread B : " + i);
        }
    }
}

public class Oop {
    
    public static void main(String[] args){
        
        // main thread start here
        A t1 = new A();
        B t2 = new B();
        
        t1.start(); //t1 thread will start
        t2.start(); //t2 thread will start
        
        for(int j = 1; j<=5; j++){
            System.out.println("Thread Main : " + j);
        }
        
    }
}
