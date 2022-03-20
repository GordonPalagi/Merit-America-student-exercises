package com.techelevator;

import java.math.BigDecimal;

public class CheckingAccount extends BankAccount{


    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }


    @Override
    public int withdraw(int amountToWithdraw) {
        int overDraftFee = 10;
        int withdrawLimit = -100;
        int newBalance = getBalance() - amountToWithdraw;

        if (newBalance > withdrawLimit) {
            super.withdraw(amountToWithdraw);
            if (getBalance() < 0) {
                super.withdraw(overDraftFee);
            }
        }
        return getBalance();
    }
}


