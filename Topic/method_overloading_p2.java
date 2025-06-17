//package com.mycompany.oop;

class Overload{
    
    void add(){
        
    } 
    
    int add(int a){
        return a;
    }   
    
    String add(String s){
        return s;
    }
    
    int add(int a, int b){
        return a + b;
    }
    
//    int add(){
//        
//    }
    
    // Only changing the return type is not sufficient for method overloading
    // This method is allowed because it has a different parameter type
    // Here, we changed the parameter list to achieve overloading
    // Return type can be different, but overloading is based on the parameter list or its types


    

}

public class Oop {

    public static void main(String[] args) {
        Overload o1 = new Overload();
        
        o1.add();
        System.out.println(o1.add(1));
        System.out.println(o1.add("A"));
        System.out.println(o1.add(3, 4));
        
        
    }
}
