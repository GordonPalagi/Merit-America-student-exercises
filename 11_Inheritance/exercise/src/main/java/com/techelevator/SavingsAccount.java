package com.techelevator;

public class SavingsAccount extends BankAccount{
    private int balance;

    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }


    @Override
    public int withdraw(int amountToWithdraw) {
        int serviceFee = 2;
        int newBalance = getBalance() - amountToWithdraw;
        int withdrawLimit = 150;
        boolean withdrawNull = newBalance < 0;


        if (newBalance > withdrawLimit) {
            super.withdraw(amountToWithdraw);

        } else if (newBalance < withdrawLimit && !withdrawNull) {
            super.withdraw(amountToWithdraw + serviceFee);
            return newBalance - serviceFee;

        } else if (withdrawNull) {
            return getBalance();
        }
        return newBalance;
    }
}
