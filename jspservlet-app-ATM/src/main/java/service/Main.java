package service;

import model.AccountDetails;

public class Main {
    public static void main(String[] args) {
        
        AccountDetails account = new AccountDetails("Savings", 0, 5000, 1234);

        
        AmountDetails amountDetails = new AmountDetails();

        
        double withdrawAmount = 2000;
        double depositAmount = 1000;

        
        double newBalance = amountDetails.withdrawAmount(withdrawAmount, account.getAvailableBalance());
        account.setAvailableBalance(newBalance);
        System.out.println("After withdrawing " + withdrawAmount + ", available balance: " + account.getAvailableBalance());

        
        newBalance = amountDetails.depositAmount(depositAmount, account.getAvailableBalance());
        account.setAvailableBalance(newBalance);
        System.out.println("After depositing " + depositAmount + ", available balance: " + account.getAvailableBalance());

        
        double currentBalance = amountDetails.accountBalance(account.getAvailableBalance());
        System.out.println("Current balance: " + currentBalance);
    }
}

