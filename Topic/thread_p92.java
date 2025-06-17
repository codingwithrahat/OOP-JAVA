//package com.mycompany.oop;

class A implements Runnable{
    Thread t;
    
    A(String s){
        t = new Thread(this, s);
        System.out.println(t);
        
        t.start();
    }

    @Override
    public void run(){
        for(int i = 1; i<=5; i++){
            System.out.println(Thread.currentThread().getName() + i);
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
        
        
        new A("My Thread_1 - "); //create a new thread 
        new A("My Thread_2 - "); //create another thread
        
        for(int j = 1; j<=5; j++){

            System.out.println("Thread Main : " + j);

        }
        
    }
}
