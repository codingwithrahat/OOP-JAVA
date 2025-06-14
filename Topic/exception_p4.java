//package com.mycompany.oop;

public class Oop {

    public static void main(String[] args) {
        int i = 0, k = 345, j;
         
        //j = k / i; //give error
        
        int a[] = new int [6];
        
        
        try{
            
            a[10] = 2; // this line gives an error
            //so the block will stop here
            j = k / i; 
            System.out.println("ABCDE"); 
            
        }catch(ArithmeticException e){ //ArithmeicException is a subclass of Exception class
            System.out.println("Arithmetic Exception");
        }catch(Exception e){
            System.out.println(e); // ArrayIndexOutOfBoundsException
        }
       
        
        
    }
}
