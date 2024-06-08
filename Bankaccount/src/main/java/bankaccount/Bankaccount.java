/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bankaccount;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class Bankaccount{
    int accountnumber;
    double balance;
    
    public Bankaccount (int accountnumber,double balance){
        this.accountnumber=accountnumber;
        this.balance=balance;
    }
    
    public void deposit (double amount){
        if(amount>0){
            System.out.println("Balance :"+balance);
            balance+=amount;
            System.out.println("deposited :"+amount+"taka");
            System .out.println("New Balance is :"+balance +"taka");
        }else{
            System.out.println("Invalid  amount");
        }
    }
        
        public void withdrow(double amount){
            if (balance>0) {
                if (amount>0){
                    
                    System.out.println("Balance :"+balance);                    balance-=amount;
                  System.out.println("withdrown :"+amount+"taka"); 
                   System .out.println("New Balance is :"+balance +"taka");
                }else{
                    System.out.println("Invalid ammount");
                }
                
            }else{
                System.out.println("Insufficiant balance");
            }
            
        }
        public static void main( String [] args){
            
            Bankaccount account1=new Bankaccount(12345,500);
            Bankaccount account2=new Bankaccount (67890,0);
            
            account1.withdrow(200);
            account2.deposit(300);
            
            
        }
        
        
    }
    


