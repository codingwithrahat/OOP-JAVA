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
        
        System.out.println(t1.isAlive()); // don't throw any error
        //if thread not started it return false
        
        t1.start();
  
        System.out.println(t1.isAlive()); //if thread started it return true

        
    }
}
