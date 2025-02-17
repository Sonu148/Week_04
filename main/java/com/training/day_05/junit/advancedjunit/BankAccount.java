package com.training.day_05.junit.advancedjunit;

public class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
    }
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(500);
        System.out.println("After Deposit: " + account.getBalance());

        account.withdraw(200);
        System.out.println("After Withdrawal: " + account.getBalance());
    }
}
