//package com.mycompany.oop;

class Person {
    private String name;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
    
    void displayPerson(){
        System.out.println("Person Info: ");

    }
}

class Teacher extends Person {
    
    //name
    //gender
    private int phn;

    public int getPhn() {
        return phn;
    }

    public void setPhn(int phn) {
        this.phn = phn;
    }
    
    

    void displayInfo(){
        
        displayPerson();
        System.out.println("Name : " + getName());
        System.out.println("Gender : " + getGender());
        System.out.println("Phn : " + phn);
        
    }
    
    
}

public class Oop {

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher();
        
        t1.setName("Rahat");
        t1.setGender("male");
        t1.setPhn(18);
        t2.setName("Rakib");
        t2.setGender("male");
        t2.setPhn(13);
        

        
        t1.displayInfo();
        t2.displayInfo();
        
    }
}
