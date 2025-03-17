//package com.mycompany.oop;


class sum{
    int sum(int a, int b){
        return a + b;
    }
}

public class Oop {

    public static void main(String[] args) {
        sum s = new sum();
        
        int a = 5;
        int b = 5;
        
        int ans = s.sum(a, b);
        
        System.out.println("Sum : " + ans);
        
    }
}
    
