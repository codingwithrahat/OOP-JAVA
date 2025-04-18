//package com.mycompany.project4;

class Shape {
    double area(){
        return 0;
    }
}

class Triangle extends Shape {
    double base, height;
    
    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    
    @Override
    double area(){
        return 0.5 * base * height; 
    }
    
    
}

class Rectangle extends Shape {
    double length, width;
    
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    @Override
    double area(){
        return length * width; 
    }
    
    
}
public class Project4 {

    public static void main(String[] args) {
        Shape tri = new Triangle(10, 20);
        Shape rec = new Rectangle(10, 20);
        
        System.out.println("Area for Triangle: " + tri.area());
        System.out.println("Area for Rectangle: " + rec.area());
    }
}
