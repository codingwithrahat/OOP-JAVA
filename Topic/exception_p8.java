//package com.mycompany.oop;

//runitme exceptions can be throw directly
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
        
        try{
            d(2, 0);
        }catch(Exception e){
            System.out.println(e.getMessage()); //getMessage only print the mssg
        }
        
    }
}
