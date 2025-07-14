
package com.mycompany.mris;

abstract public class Person implements Trainable , Duty{
    String id, name;
    int age;
    String rank;
    private int leaves = 10;
    
    String training;
    String duty;
    
    Person(String id, String name, int age, String rank){
        this.id = id;
        this.name = name;
        this.age = age;
        this.rank = rank;
    }
    
    void requestLeave(){
        if(leaves >= 1) {
            leaves = leaves - 1;
            System.out.println("Leave Granted. Remaning leave : " + leaves);
        }else{
            System.out.println("You are not illegible for leave");
        }
    }
    
    void requestLeave(int days){
        if(days <= leaves){
            leaves = leaves - days;
            System.out.println("Leave Granted. Remaning leave : " + leaves);
        }else{
            System.out.println("You are not illegible for leave");
        }
    }
    
    void displayInfo(){
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Rank : " + rank);
    }
    
    abstract void displayRole();
    abstract void calculateSalary();
    
    
    @Override
    public void assignTraining(String training){
        this.training = training;
    }
    
    @Override
    public void assignDuty(String duty){
        this.duty = duty;
    }
    
    @Override
    public void showTraining(){
        System.out.println("Training : " + training);
    }
    
    @Override
    public void showDuty(){
        System.out.println("Duty : " + duty);
    }
    
}
