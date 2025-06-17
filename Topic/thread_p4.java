//package com.mycompany.oop;

class A implements Runnable{

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
        
        // main thread start here
        A t1 = new A();
       
        //t1.start(); //t1 can't start , cz it implement a interface
        //runnable interface only have run() method 
        //thread has the start() method
        
        Thread t = new Thread(t1);
        t.start(); // t1 will start , cz it pass the ref of t1
        
        
        for(int j = 1; j<=5; j++){

            System.out.println("Thread Main : " + j);

        }
        
    }
}
