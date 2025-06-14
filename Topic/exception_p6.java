//package com.mycompany.oop;

public class Oop {
    
    static void d(int n1, int n2) throws ArithmeticException{ //throws use to handle exception in a method
        if(n2 == 0){
            throw new ArithmeticException("Zero not allow"); //throw use to throw a exception
        }
        
        int r = n1/n2;
        System.out.println(r);
    }

    public static void main(String[] args) {
        
        try{
            d(2, 0);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}
