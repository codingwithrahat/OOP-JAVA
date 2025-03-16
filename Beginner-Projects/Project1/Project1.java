//package com.mycompany.project1;

import java.util.Scanner;

class Student{
    String name;
    String id;
    double cgpa;
    
    
    Student(String n, String i, double c){
        name = n;
        id = i;
        cgpa = c;
    }
    
    void displayStuInfo(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("CGPA: " + cgpa);
    }
    
    String checkResult(){
        if(cgpa > 3.50){
            return "Good";
        }else{
            return "Better Luck Next Time";
        }
    }
            
    
}



public class Project1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter 1st Student's Info");
        System.out.print("Enter Name : ");
        String name = s.nextLine();
        System.out.print("Enter ID : ");
        String id = s.nextLine();
        System.out.print("Enter CGPA : ");
        double cgpa = s.nextDouble();
        s.nextLine();
        
        
        Student s1 = new Student(name, id, cgpa);
        
        System.out.println("Enter 2nd Student's Info");
        System.out.print("Enter Name : ");
        String name2 = s.nextLine();
        System.out.print("Enter ID : ");
        String id2 = s.nextLine();
        System.out.print("Enter CGPA : ");
        double cgpa2 = s.nextDouble();
        s.nextLine();
        
        Student s2 = new Student(name2, id2, cgpa2);
        
        System.out.println("\n" + s1.name + " INFO");
        s1.displayStuInfo();
        System.out.println("\n" +s2.name + " INFO");
        s2.displayStuInfo();
        
        System.out.println(s1.name + " " + s1.checkResult());
        
        System.out.println(s2.name + " " + s2.checkResult());
        
    }
}
