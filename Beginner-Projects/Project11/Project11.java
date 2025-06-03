//package com.mycompany.project11;

class Course {
    String courseName, courseCode;
    double creditHours;
    Course(String courseName, String courseCode, double creditHours){
        this.courseName = courseName;
        this.courseCode = courseCode; 
        this.creditHours = creditHours;
    }
    void calculateDifficulty(){

    }
}

class Student {
    String studentID, name;
    String list[] = new String[6];
    Student(String studentID, String name){
        this.studentID = studentID;
         this.name = name;
    }    
    void entrollInCourse(String c){
        
    }
    void dropCourse(String c){
        
    }
}

class UndergraduateCourse extends Course {
    String generalEducationRequirement;
    UndergraduateCourse(String courseName, String courseCode, double creditHours, String generalEducationRequirement){
        super(courseName, courseCode, creditHours);
        this.generalEducationRequirement = generalEducationRequirement;
    }
    @Override
    void calculateDifficulty(){
        if(generalEducationRequirement == "Biology"){
            System.out.println("Hard");
        }else if(generalEducationRequirement == "Math"){
            System.out.println("Medium");
        }else{
            System.out.println("Easy");
        }
    }
}

class PostgraduateCourse extends Course{
    String researchComponent;
    
    PostgraduateCourse(String courseName, String courseCode, double creditHours, String researchComponent){
        super(courseName, courseCode, creditHours);
        this.researchComponent = researchComponent;
    }
    
    @Override
    void calculateDifficulty(){
        if(researchComponent == "Thesis"){
            System.out.println("Hard");
        }else if(researchComponent == "Project"){
            System.out.println("Medium");
        }else{
            System.out.println("Easy");
        }
    }
}

class UndergraduateStudent extends Student{
    String advisorName;   
    UndergraduateStudent(String studentID, String name, String advisorName){
        super(studentID, name);
        this.advisorName = advisorName;
    }  
    int i = 0;
    @Override
    void entrollInCourse(String s){    
        if(i < 6){
           list[i] = s;
            i++; 
        }else{
            System.out.println("Reach your limit");
        }        
    }   
    @Override
    void dropCourse(String s){
        int l = -1;
        for(int j = 0; j<i; j++){
            if(list[j] == s){
                list[j] = null;
                l = j;
            }
            
        }
        if(l == -1) {
            System.out.println("Course Not Found!");
            return;
        }
        for(int k = l; k<i - 1; k++){
            list[k] = list[k + 1];
        }
        list[i - 1] = null;
        i--;
        System.out.println("Course Droped : " + s);
    }
    void viewEnrollCourse(){
        System.out.println("Your Courses Are");
        for(int e = 0; e < list.length; e++){
            System.out.println(list[e]);
        }
    }
}

class PostgraduateStudent extends Student{
    String thesisTopic;
  
    PostgraduateStudent(String studentID, String name, String thesisTopic){
        super(studentID, name);
        this.thesisTopic = thesisTopic;
    }

    int i = 0;
    
    @Override
    void entrollInCourse(String s){
        
        if(i < 4){
           list[i] = s;
            i++; 
            System.out.println("Course Enroll : " + s);
        }else{
            System.out.println("Reach your limit");
        }
        
    }
    
    @Override
    void dropCourse(String s){
        int l = -1;
        for(int j = 0; j<i; j++){
            if(list[j] == s){
                list[j] = null;
                l = j;
            }
            
        }
        if(l == -1) {
            System.out.println("Course Not Found!");
            return;
        }
        
        for(int k = l; k<i - 1; k++){
            list[k] = list[k + 1];
        }
        
        list[i - 1] = null;
        i--;
        System.out.println("Course Droped : " + s);
    }
    
    void viewEnrollCourse(){
        System.out.println("Your Courses Are");
        for(int e = 0; e < list.length - 2; e++){
            System.out.println(list[e]);
        }
    }
}


public class Project11 {

    public static void main(String[] args) {
        UndergraduateCourse uc1 = new UndergraduateCourse("JAVA", "1", 3, "Math");
        UndergraduateCourse uc2 = new UndergraduateCourse("DSA", "2", 3, "Biology");
        UndergraduateCourse uc3 = new UndergraduateCourse("STL", "2", 3, "Biology");
        UndergraduateCourse uc4 = new UndergraduateCourse("Graph", "2", 3, "Biology");
        UndergraduateCourse uc5 = new UndergraduateCourse("Number Theory", "2", 3, "Biology");
        UndergraduateCourse uc6 = new UndergraduateCourse("CPP", "2", 3, "Biology");
        UndergraduateCourse uc7 = new UndergraduateCourse("Segment Tree", "2", 3, "Biology");
        
        PostgraduateCourse pc1 = new PostgraduateCourse("Advance JAVA", "1", 3, "Thesis"); 
        
        UndergraduateStudent us1 = new UndergraduateStudent("527", "Rahat", "Nazrul");
        PostgraduateStudent ps1 = new PostgraduateStudent("528", "Rakib", "Nazrul");
        
        uc1.calculateDifficulty();
        
        us1.entrollInCourse(uc1.courseName);
        us1.entrollInCourse(uc2.courseName);
        us1.entrollInCourse(uc3.courseName);
        us1.entrollInCourse(uc4.courseName);
        us1.entrollInCourse(uc5.courseName);
        us1.entrollInCourse(uc6.courseName);
        us1.entrollInCourse(uc7.courseName);
        
        us1.viewEnrollCourse();
        
        us1.dropCourse(uc1.courseName);
        
        us1.viewEnrollCourse();
        
        ps1.entrollInCourse(pc1.courseName);
        ps1.viewEnrollCourse();
  
        
    }
}
