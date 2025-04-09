//package com.mycompany.oop;

class Encap{
    private String name;
    private int age;
    
    public void setName(String s){
        name = s;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getage(){
        return age;
    }
    
}

public class Oop {

    public static void main(String[] args) {
        Encap e1 = new Encap();
        
        e1.setName("Rahat");
        System.out.println(e1.getName());
        
        e1.setAge(18);
        System.out.println(e1.getage());
    }
}
