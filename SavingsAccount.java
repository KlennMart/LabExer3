
package runsavingsaccount;


public class SavingsAccount {
    private double balance;
    public static double interestRate = 0;
    public SavingsAccount(){
        balance = 0;
    
   
    }
    public static void setInterestRate(double newRate){
        interestRate = newRate;
    }
    public static double getInterestRate(){
        return interestRate;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit (double amount){
        balance += amount;
    }
    public double withdraw(double amount){
        if (balance >= amount){
           balance -= amount;
           return amount;
        }else{
            return 0;
        }
    }
    public void addInterest(){
        double interest = balance * interestRate;
    }
     public static void ShowBalance(SavingsAccount account){
         System.out.println("Current balance: " + account.getBalance());
     }
     }
            

