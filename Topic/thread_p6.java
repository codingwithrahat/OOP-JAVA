//package com.mycompany.oop;

class A extends Thread{
    
    A(String s){
        super(s); //it take a name and pass it to thread constructor
    }

    @Override
    public void run(){
        for(int i = 1; i<=5; i++){
            System.out.println("Thread A : " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class Oop {
    
    public static void main(String[] args){
        
        A t1 = new A("My Thread");
        t1.start();

        System.out.println("Name : " + t1.getName()); //to get thread name
        
        
        Thread t2 = Thread.currentThread(); //currentThread return which thread is currently execute
        
        System.out.println("Name : " + t2.getName());  
        
        //System.out.println("Name : " +  Thread.currentThread().getName()); 
        //this will also work
        
    }
}
