//package com.mycompany.oop;

//runtimeexception can be throw directly
//my own create exception extend RuntimeException
//this is called unchecked exception

class myException extends RuntimeException{ 
    myException(String mssg){
        super(mssg);
    }
}
public class Oop {
    
    static void d(int n1, int n2){ //don't need throws keyword, beacuse it can throw directly
        if(n2 == 0){
            throw new myException("Zero not allow"); //throw keyword is used to throw a exception
        }
        
        int r = n1/n2;
        System.out.println(r);
    }

    public static void main(String[] args) {
        d(2, 0);
        // It will give an error at runtime
        // but at compile time, it says it's okay
        // However, if it is checked (extends Exception), then it will give a compile-time error
        // Checked exceptions need to be handled with try-catch at compile time
        // RuntimeException (unchecked) can still cause the program to crash at runtime if not handled with try-catch

//        try{
//            d(2, 0);
//        }catch(Exception e){
//            System.out.println(e.getMessage()); //getMessage only print the mssg
//        }
        
    }
}
