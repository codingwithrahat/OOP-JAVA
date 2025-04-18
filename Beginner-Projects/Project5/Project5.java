//package com.mycompany.project5;

abstract class Shape{
    double val1, val2;
    
    Shape(double val1, double val2){
        this.val1 = val1;
        this.val2 = val2;
    }
    
    abstract void area();
    
}

class Triangle extends Shape{
    
    //val1, val2
    
    Triangle(double base, double height){
        super(base, height);
    }
    
   
    @Override
    void area(){
        double ans = 0.5 * val1 * val2;
        System.out.println("Area of Triangle: " + ans);
    }
}

class Rectangle extends Shape{
    
    //val1, val2
    
    Rectangle(double length, double width){
        super(length, width);
    }
    
   
    @Override
    void area(){
        double ans = val1 * val2;
        System.out.println("Area of Rectangle: " + ans);
    }
}

class Circle extends Shape{
    
    //val1, val2
    
    Circle(double r){
        super(r, r);
    }
    
   
    @Override
    void area(){
        double ans = 3.1416 * val1 * val2;
        System.out.println("Area of Circle: " + ans);
       
    }
}
public class Project5 {

    public static void main(String[] args) {
        Shape s;
        
        s = new Triangle(10, 20);
        s.area();
        
        s = new Rectangle(10, 20);
        s.area();
        
        s = new Circle(10);
        s.area();
        
        
    }
}
