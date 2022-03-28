package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {

    private String name;
    private String address;
    private String phoneNumber;


    public void addAccount(Accountable newAccount) {
        accounts.add(newAccount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Accountable[] getAccounts() {
        return accounts.toArray(new Accountable[0]);
    }

    public void setAccounts(List<Accountable> accounts) {
        this.accounts = accounts;
    }

    private List<Accountable> accounts = new ArrayList<>();


    public boolean isVip() {
        int vipStatus = 25000;
        int sum = 0;
        for (Accountable bankAccount : accounts) {
            sum += bankAccount.getBalance();
        }
        return sum >= vipStatus;
    }
}
