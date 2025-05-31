//package com.mycompany.project9;

class Person {
    String name;
    int age;
    String address;
    
    Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    void show_info(){
        
    }
    
}

interface Employee {
    void get_salary();
}

interface CourseParticipant {
    void enroll(String course);
    void get_courses();
    
}

class Student extends Person implements CourseParticipant{
    String student_id, major;
    Student(String name, int age, String address, String student_id, String major){
        super(name, age, address);
        this.student_id = student_id;
        this.major = major;
    }
    
    String course;
    
    @Override
    public void enroll(String course){
        this.course = course;
    }
    
    @Override
    public void get_courses(){
         System.out.println("Course Taken: " + course);
    }
    
    
    @Override
    void show_info(){
        System.out.println("Student Information : ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("ID: " + student_id);
        System.out.println("Department : " + major);

    }

   
}

class Teacher extends Person implements Employee, CourseParticipant{
    Teacher(String name, int age, String address){
        super(name, age, address);
    }
    
    @Override
    public void get_salary(){
        System.out.println("Salary: 100K");
    }
    
    
    String course;
    
    @Override
    public void enroll(String course){
        this.course = course;
    }
    
    @Override
    public void get_courses(){
        System.out.println("Course Taken: " + course);
    }
    
    @Override
    void show_info(){
        System.out.println("Tacher Information : ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);

    }
        
}

class GraduateStudent extends Student{
    String thesis_title;
    
    GraduateStudent(String name, int age, String address, String student_id, String major, String thesis_title){
        super(name, age, address, student_id, major);
        this.thesis_title = thesis_title;
    }
    
    @Override
    void show_info(){
        System.out.println("Student Information (Graduate) : ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("ID: " + student_id);
        System.out.println("Department : " + major);
        System.out.println("His final Thesis was " + thesis_title);
    }
}

public class Project9 {

    public static void main(String[] args) {
        Student s1 = new Student("Rahat", 22, "ECB", "12", "CSE");
        GraduateStudent g1 = new GraduateStudent("Rakib", 26, "Mirpur", "111", "BBA", "Marketing Oportunity in BD");
        Teacher t1 = new Teacher("Mr. Sakib", 27, "Badda");
       
        s1.show_info();
        s1.enroll("JAVA");
        s1.get_courses();
        
        t1.show_info();
        t1.get_salary();
        t1.enroll("JAVA");
        t1.get_courses();
        
        g1.show_info();
        
    }
}
