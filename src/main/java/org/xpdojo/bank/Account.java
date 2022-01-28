package org.xpdojo.bank;

public class Account {

    private int balance;

    public static Account emptyAccount() {
        return new Account();
    }

    private Account() {

    }

    public int balance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount ;
    }

    public void transfer(int amount, Account receivingAccount) {
        withdraw(amount);
    }
}
