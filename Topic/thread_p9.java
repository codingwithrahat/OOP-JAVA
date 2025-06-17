//package com.mycompany.oop;

class A extends Thread{
   
    int x;
    @Override
    public void run(){
        
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        
    }
}

public class Oop {
    
    public static void main(String[] args) throws InterruptedException{
        
        A t1 = new A();
        A t2 = new A();
        A t3 = new A();
        
        System.out.println(t3.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t1.getPriority());
        //by default all priority are set to 5
        
        t1.setName("Thread1"); //set name of a thread
        t2.setName("Thread2");
        t3.setName("Thread3");
        
        t3.setPriority(2);
        t2.setPriority(7);
        t1.setPriority(9); //it wil execute first, then t2 and then t3  
        //priority wither higher value will come first in 99% time
        
        t1.start();
        t2.start();
        t3.start();
        
        
        
        
    }
}
