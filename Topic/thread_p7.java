//package com.mycompany.oop;

class A extends Thread{
    
    A(String s){
        super(s); //it take a name and pass it to thread constructor
    }
    int x;
    @Override
    public void run(){
        
        for(int i = 1; i<=100000; i++){
            x++;
        }
    }
}

public class Oop {
    
    public static void main(String[] args) throws InterruptedException{
        
        A t1 = new A("My Thread");
        t1.start();
        
        t1.join(); //it can be throw error like sleep method, so we use throws keyword in main method
        //mian thread will hold here, when t1 finish it work then main thread execute again
        
        System.out.println(t1.x); //so it print whole 1000000 
        
        
    }
}
