//package com.mycompany.oop;

class A extends Thread{

    @Override
    public void run(){
        for(int i = 1; i<=5; i++){
            System.out.println("Thread A : " + i);
            try {
                Thread.sleep(1000); // it can throw inturrupted exception
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Oop {
    
    public static void main(String[] args){
        
        // main thread start here
        A t1 = new A();
       
        t1.start(); //t1 thread will start
        
        for(int j = 1; j<=5; j++){
            // mian thread is runing , But thread A is sleeping after each print
            // so main thread finish its loop early
            System.out.println("Thread Main : " + j);
//            try {
//                Thread.sleep(1000);
//            } catch (Exception e) {
//                System.out.println(e);
//            }
        }
        
    }
}
