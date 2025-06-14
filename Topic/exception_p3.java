//package com.mycompany.oop;

public class Oop {

    public static void main(String[] args) {
        int i = 0, k = 345, j;
        
        System.out.println("Hello");
         
        //j = k / i; //give error
        
        
        try{
            j = k / i; //give error
            System.out.println("ABCDE"); 
            
        }catch(ArithmeticException e){ //ArithmeicException is a subclass of Exception class
            System.out.println("Arithmetic Exception");
        }catch(Exception e){
            System.out.println("General Exception"); 
        }
        
        
        System.out.println("World");
        
        
    }
}
