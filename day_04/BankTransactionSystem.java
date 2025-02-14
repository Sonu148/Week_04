package com.day_04;

public class BankTransactionSystem {

    // Custom Exception for Insufficient Balance
    class InsufficientBalanceException extends Exception {
        public InsufficientBalanceException(String message) {
            super(message);
        }
    }

    private double balance;

    // Constructor for initializing balance
    public BankTransactionSystem(double balance) {
        this.balance = balance;
    }

    // Method to withdraw money and handle exceptions
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankTransactionSystem account = new BankTransactionSystem(1000);

        try {
            account.withdraw(1500);
            System.out.println("Withdrawal successful, new balance: " + account.getBalance());
        } catch (InsufficientBalanceException e) {
            System.out.println("Insufficient balance!");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid amount!");
        }
    }
}
