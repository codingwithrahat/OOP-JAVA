//package com.mycompany.oop;

interface Animal {
    void info_A();
                
}

interface Dog {
    void info_D();
                
}

//Interface can extend multiple interfaces.
//This is also an example of multiple inheritance.

interface Puppy extends Animal, Dog {
    void info_P();
}

class Tommy implements Puppy{
    @Override
    public void info_A(){
        System.out.println("Tommy is an Animal");
    }
    
    @Override
    public void info_D(){
        System.out.println("Tommy is a Dog");
    }
    
    @Override
    public void info_P(){
        System.out.println("Tommy is a Puppy");
    }
    
 
}

// The code below is also correct and works the same as the above code.
// But it's unusual and not recommended for clarity.

/*

class Tommy implements Puppy, Dog, Animal{
    @Override
    public void info_A(){
        System.out.println("Tommy is an Animal");
    }
    
    @Override
    public void info_D(){
        System.out.println("Tommy is a Dog");
    }
    
    @Override
    public void info_P(){
        System.out.println("Tommy is a Puppy");
    }
    
 
}

*/

public class Oop {

    public static void main(String[] args) {
        Tommy t1 = new Tommy();
        
        t1.info_A();
        t1.info_D();
        t1.info_P();
    }
}
