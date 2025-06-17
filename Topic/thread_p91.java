//package com.mycompany.oop;

class p{
    static int c = 1;
    synchronized public static void cnt(){ // it will stop other thread , when t1 is running
        //it will print the count in a order
        for(int i = 1; i<=3; i++){
            System.out.println("Count " + (c++));
        }
    }
}

class A extends Thread{
   
    int x;
    @Override
    public void run(){
       p.cnt();
        
    }
}

public class Oop {
    
    public static void main(String[] args){
        
        A t1 = new A();
        A t2 = new A();
        
        
        t1.start();
        t2.start();
        
        
 
        
    }
}
