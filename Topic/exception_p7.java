//package com.mycompany.oop;

//exception can,t be throw directly, need throws keyword 
//my own create exception extend Exception
//this is called checked exception

class myException extends Exception{ 
    myException(String mssg){
        super(mssg);
    }
}
public class Oop {
    
    static void d(int n1, int n2) throws myException{ //need throws keyword, beacuse it can't throw directly
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
