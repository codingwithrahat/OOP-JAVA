//package com.mycompany.project7;

class Animal {
    String gen;
    
    Animal(String gen){
        this.gen = gen;
    }
    
    void initA(String gen){
        this.gen = gen;
    }
    
    
    void eat(){
        
    }
    
    
}

class Dog extends Animal {
    String nameD;
    
    Dog(String gen, String nameD){
        super(gen);
        this.nameD = nameD;
    }
    
    void initD(String gen, String nameD){
        super.initA(gen);
        this.nameD = nameD;
    }

}

class Cat extends Animal {
    String nameC;
    
    Cat(String gen, String nameC){
        super(gen);
        this.nameC = nameC;
    }

    void initC(String gen, String nameC){
        super.initA(gen);
        this.nameC = nameC;
    }
}

class FoodDog extends Dog {
    String nameFD;
    
    FoodDog(String gen, String nameD, String nameFD){
        super(gen, nameD);
        this.nameFD = nameFD;
        
    }
    
    
    void initFD(String gen, String nameD, String nameFD){

        super.initD(gen, nameD);
        this.nameFD = nameFD;
    }
    
    @Override
    void eat(){
        System.out.println(nameD + " eats : " + nameFD);
    }
    
    
}

class FoodCat extends Cat {
    String nameFC;
    
    FoodCat(String gen, String nameC, String nameFC){
        super(gen, nameC);
        this.nameFC = nameFC;
        
    }
    
    
    void initFC(String gen, String nameC, String nameFC){
        super.initC(gen, nameC);
        this.nameFC = nameFC;
    }
    
    @Override
    void eat(){
        System.out.println(nameC + " eats : " + nameFC);
    }
    
    
}

public class Project7 {

    public static void main(String[] args) {
        
         FoodDog d1 = new FoodDog("Dog", "Tommy", "Biskuit");
         FoodCat c1 = new FoodCat("Cat", "Tom", "Cake");
         
         d1.eat();
         c1.eat();
        
    }
}

