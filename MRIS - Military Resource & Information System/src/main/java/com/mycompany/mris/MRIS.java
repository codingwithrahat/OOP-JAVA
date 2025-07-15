package com.mycompany.mris;

import java.util.Scanner;

public class MRIS {
    
    static Person list[] = new Person[100];
    static int i = 0;
    
    static void SCU(Scanner s){
        System.out.println("Enter Your ID : ");
        String soilderID = s.nextLine();
        
        Person p = null;
        
        for(int j = 0; j<i; j++){
            if(soilderID.equals(list[j].id)){
                p = list[j];
                break;
            }
        }
        
        if(p == null){
            System.out.println("No Recored Found!");
            System.out.println("Invalid Soilder ID");
            return;
                    
        }
        
        while(true){
            System.out.println("\n Soilder Command Unit");
            System.out.println("1 - View Profile");
            System.out.println("2 - Request Leave");
            System.out.println("3 - Salary Information");
            System.out.println("4 - Show Training & Duty");
            System.out.println("0 - Back to Home Page");
            System.out.println("Enter Your Command : ");
            int choice = s.nextInt();
            s.nextLine();
            
            if(choice == 1){
                p.displayInfo();
                p.displayRole();
            }else if(choice == 2){
                System.out.println("Enter number of days");
                int days = s.nextInt();
                
                if(days == 1){
                    p.requestLeave();
                }else{
                    p.requestLeave(days);
                }
            }else if(choice == 3){
                p.calculateSalary();
            }else if(choice == 4){
                p.showTraining();
                p.showDuty();
            }else if(choice == 0){
                break;
            }else{
                System.out.println("Invalid Command");
            }
        }
    }
    
    static void searchSoilder(Scanner s){
        System.out.println("Enter Soilder ID : ");
        String searchId = s.nextLine();
        
        int flag = 0;
        
        for(int j = 0; j < i; j++){
            if(searchId.equals(list[j].id)){
                list[j].displayInfo();
                list[j].displayRole();
                flag = 1;
                break;
            }
                
        }
        
        if(flag == 0){
            System.out.println("Soilder Not Found");
        }
    }
    
    static void addSoilder(Scanner s){
        if(i > list.length){
            System.out.println("Command Failed!");
            System.out.println("Upgrade Database Storage");
            return;
        }
        
        System.out.println("Enter ID : ");
        String id = s.nextLine();
        System.out.println("Enter Name : ");
        String name = s.nextLine();
        System.out.println("Enter Age : ");
        int age = s.nextInt();
        s.nextLine();
        
        
        
        System.out.println("Soilder Category : ");
        System.out.println("1 - NCO");
        System.out.println("2 - JCO");
        System.out.println("3 - CO");
        
        int choice = s.nextInt();
        s.nextLine();
  
        
        if(choice == 1){
            
            System.out.println("Enter Rank : ");
            System.out.println("1 - Soinik");
            System.out.println("2 - Corporal");
            System.out.println("3 - Sergent");
            
            int choice2 = s.nextInt();
            s.nextLine();
            
            String rank = "";
            
            if(choice2 == 1){
                rank = "Soinik";
            }else if(choice2 == 2){
                rank = "Corporal";
            }else if(choice2 == 3){
                rank = "Sergent";
            }else{
                System.out.println("Invalid Command");
            }
            
            
            list[i] = new NCO(id, name, age, rank);
            i++;
            
        }else if(choice == 2){
            
            System.out.println("Enter Rank : ");
            System.out.println("1 - Junior Warrent Officer");
            System.out.println("2 - Warrent Officer");
            System.out.println("3 - Senior Warrent Officer");
            
            int choice2 = s.nextInt();
            s.nextLine();
            
            String rank = "";
            
            if(choice2 == 1){
                rank = "Junior Warrent Officer";
            }else if(choice2 == 2){
                rank = "Warrent Officer";
            }else if(choice2 == 3){
                rank = "Senior Warrent Officer";
            }else{
                System.out.println("Invalid Command");
            }
       
            list[i] = new JCO(id, name, age, rank);
            i++;
            
        }else if(choice == 3){
            
            System.out.println("Enter Rank : ");
            System.out.println("1 - Captain");
            System.out.println("2 - Major");
            System.out.println("3 - General");
            
            int choice2 = s.nextInt();
            s.nextLine();
            
            String rank = "";
            
            if(choice2 == 1){
                rank = "Captain";
            }else if(choice2 == 2){
                rank = "Major";
            }else if(choice2 == 3){
                rank = "General";
            }else{
                System.out.println("Invalid Command");
            }
            
            System.out.println("Soilder Core : ");
            System.out.println("1 - Artillery Corps");
            System.out.println("2 - Enginner Corps");
            System.out.println("3 - Medical Corps");
            
            int choice3 = s.nextInt();
            s.nextLine();
            
            if(choice3 == 1){
                System.out.println("Enter Field Type : ");
                System.out.println("1 - Air Defense");
                System.out.println("2 - Field Artillery");
                
                int choice4 = s.nextInt();
                s.nextLine();
            
                String fieldType = "";
                
                if(choice4 == 1){
                    fieldType = "Air Defense";
                }else if (choice4 == 2){
                    fieldType = "Field Artillery";
                }else{
                    System.out.println("Invalid Command");
                }
                
                list[i] = new ArtilleryCorps(id, name, age, rank, fieldType);
                i++;
                
            }else if(choice3 == 2){
                System.out.println("Enter Engineer Field : ");
                System.out.println("1 - Mechanical Divison");
                System.out.println("2 - IT Divison");
                
                int choice4 = s.nextInt();
                s.nextLine();
            
                String engineerField = "";
                
                if(choice4 == 1){
                   engineerField = "Mechanical Divison";
                }else if (choice4 == 2){
                   engineerField = "IT Divison";
                }else{
                    System.out.println("Invalid Command");
                }
                
                list[i] = new EngineerCorps(id, name, age, rank, engineerField);
                i++;
                
            }else if(choice3 == 3){
                System.out.println("Enter Medical Spechialty : ");
                System.out.println("1 - Field Physician");
                System.out.println("2 - Medicine Officer");
                
                int choice4 = s.nextInt();
                s.nextLine();
            
                String medicalSpeciality = "";
                
                if(choice4 == 1){
                   medicalSpeciality = "Field Physician";
                }else if (choice4 == 2){
                   medicalSpeciality = "Medicine Officer";
                }else{
                    System.out.println("Invalid Command");
                }
                
                list[i] = new MedicalCorps(id, name, age, rank, medicalSpeciality);
                i++;
                
            }else{
                System.out.println("Invalid Command");
            }
            
        }else{
            System.out.println("Invalid Command");
        }
 
        
    }
    
    static void CCU(Scanner s){
        while(true){
            System.out.println("\n Central Command Unit");
            System.out.println("1 - Add Soilder Info");
            System.out.println("2 - Search Soilder By ID");
            System.out.println("3 - Assign Trainning & Duty");
            System.out.println("0 - Back to Home Page");
            System.out.println("Enter Your Command : ");
            int choice = s.nextInt();
            s.nextLine();
        
            if(choice == 1){
                addSoilder(s);
            }else if(choice == 2){
                searchSoilder(s);
            }else if(choice == 3){
                System.out.println("Enter Soilder ID : ");
                String soilderID = s.nextLine();
        
                Person p = null;
        
                for(int j = 0; j<i; j++){
                    if(soilderID.equals(list[j].id)){
                        p = list[j];
                        break;
                    }
                }
                System.out.println("Trainning : ");
                String t = s.nextLine();
                p.assignTraining(t);
                
                System.out.println("Duty : ");
                String d = s.nextLine();
                p.assignDuty(d);
                
            }else if(choice == 0){
                break;
            }else{
                System.out.println("Invalid Command");
            }
        }
        
    }
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        while(true){
            System.out.println("MRIS - Military Resource & Information System");
            System.out.println("1 - Central Command Unit (CCU)");
            System.out.println("2 - Soilder Command Unit (SCU)");
            System.out.println("0 - Exit");
            System.out.println("Enter Your Command : ");
            int choice = s.nextInt();
            s.nextLine();
            
            if(choice == 1){
                CCU(s);
            }else if(choice == 2){
                SCU(s);
            }else if(choice == 0){
                break;
            }else{
                System.out.println("Invalid Command");
            }
            
        }
        
    }
 
}
