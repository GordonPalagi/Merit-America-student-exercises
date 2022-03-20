package com.techelevator;

public class BankAccount {

    private final String accountHolderName;
    private final String accountNumber;
    private int balance;

    // constructors
    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }

    public BankAccount(String accountHolderName, String accountNumber, int balance) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    // methods
    public int deposit(int amountToDeposit) {
        return balance = balance + amountToDeposit;
    }

    public int withdraw(int amountToWithdraw) {
        return balance = balance - amountToWithdraw;
    }


    // getters
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }
}
