package runsavingsaccount;

import java.util.Scanner;

public class RunSavingsAccount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SavingsAccount savings = new SavingsAccount();
        System.out.print("Enter interest rate: ");
        double rate = scanner.nextDouble();
        SavingsAccount.setInterestRate(rate);
        System.out.print("Enter deposit amount: ");
        double initialDeposit = scanner.nextDouble();
        savings.deposit(initialDeposit);
        System.out.print("Press 'D' to deposit 'W' to withdraw: ");
        char choose = scanner.next().toUpperCase().charAt(0);
        if (choose == 'D'){
        System.out.println("Enter amount to deposit:");
        double amount = scanner.nextDouble();
        savings.deposit(amount);
        } else if (choose == 'W'){
        System.out.println("Enter amount to withdraw: P");
        double amount = scanner.nextDouble();
        double withdrawn = savings.withdraw(amount);
        if (withdrawn == 0) {
            System.out.println("Insufficient balance.");
        }else{
            System.out.println("Invalid otion.");
        }
        
        SavingsAccount.ShowBalance(savings);
        if (savings.getBalance() > 1000){
            savings.addInterest();
            System.out.println("Interest applied.");
            SavingsAccount.ShowBalance(savings);
        }
        scanner.close();
        }
        
    
    }
}

        
