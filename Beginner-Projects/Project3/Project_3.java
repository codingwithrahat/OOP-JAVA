//package com.mycompany.project_3;

class Box{
    double height, width, depth;
    
    
    Box(double height, double width, double depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    
    void displayVol(){
        double vol = height * width * depth;
        System.out.println("Volume : " + vol);
        
    }
    
    
}
public class Project_3 {

    public static void main(String[] args) {
        Box b1 = new Box(10, 10, 10);
        Box b2 = new Box(20, 30, 10);
        
        b1.displayVol();
        b2.displayVol();
    }
}
