//package com.mycompany.project6;

abstract class Account{
    String accountNumber;
    double balance;
    
    Account(double balance){
        this.balance = balance;
    }
    Account(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    
    abstract double caclulateInterest();
        
    
}

class SavingAccount extends Account {
    double interestRate;
    
    SavingAccount(double balance, double interestRate){
        super(balance);
        this.interestRate = interestRate;
    }
  
     SavingAccount (String accountNumber, double balance, double interestRate){

        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
   
    @Override
    double caclulateInterest(){
         double interest;
        if(balance < 0){
            interest = 0;
        }else{
            interest = balance * interestRate;
        }
        
        return interest;
    }
 
    double caclulateInterest(double custom_i){
        
        double interest ;
        if(balance < 0){
            interest = 0;
        }else{
            interest = balance * custom_i;
        }
        return interest;
     
        
    }
      
    
}

class FixedAccount extends Account {
    double interestRate;
    double dipositPeriod;
    
   FixedAccount(double balance, double interestRate, double dipositPeriod){
        super(balance);
        this.interestRate = interestRate;
        this.dipositPeriod = dipositPeriod;
        
    }
    
    FixedAccount(String accountNumber, double balance, double interestRate, double dipositPeriod){
        super(accountNumber, balance);
        this.interestRate = interestRate;
        this.dipositPeriod = dipositPeriod;
    }
    

    @Override
    double caclulateInterest(){
        double interest;
        if(balance < 0){
            interest = 0;
        }else{
            interest = balance * interestRate * (dipositPeriod / 12.0);
        }
        
           return interest;
        
    }
    
    double caclulateInterest(double custom_i){
       
        double interest;
        if(balance < 0){
            interest = 0.5;
        }else{
            interest = balance * custom_i;
        }
        
        return interest;
        
    }
     
    
}

public class Project6 {

        public static void main(String[] args) {
        
        SavingAccount s1 = new SavingAccount("123", 12.5, 2.5);
        FixedAccount f1 = new FixedAccount("456", 3, 1.3, 2.1);
        
        double ans1 = s1.caclulateInterest();
        double ans2 = f1.caclulateInterest();
        
        SavingAccount s2 = new SavingAccount(1.2,2.7);
        FixedAccount f2 = new FixedAccount(4.5, 1.3, 2.1);

        double ans3 = s2.caclulateInterest(1.2);
        double ans4 = f2.caclulateInterest(4.5);
        
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
        System.out.println(ans4);

        
    }
}
