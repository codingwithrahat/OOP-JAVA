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
        }
        
        //here catch function can't handle cz this is an arrayindexoutofbound exception        
        //so this line doesn't execute
        //but we can handle it using finally keyword
        //System.out.println("Last Line of code");
           
        finally{
            System.out.println("Last Line of code");
            //this line will print 
        }  
        
    }
}
