package pkg;

public class BankAccount {

    private String owner;
    private int accountNumber;
    private double balance;
    private boolean isActive;

    private static int nextAccountNumber = (int)(Math.random() * 950 + 50) + 1;

    public BankAccount() {
        owner = "Unknown";
        balance = 0;
        isActive = true;
        accountNumber = nextAccountNumber;
        nextAccountNumber++;
    }

    public BankAccount(String ownerName) {
        owner = ownerName;
        balance = 0;
        isActive = true;
        accountNumber = nextAccountNumber;
        nextAccountNumber++;
    }

    public BankAccount(String ownerName, double ideposit) {
        owner = ownerName;
        balance = ideposit;
        isActive = true;
        accountNumber = nextAccountNumber;
        nextAccountNumber++;
    }

    public void checkBalance() {
        System.out.println("Your current balance is $" + balance);
    }

    public void displayAccountInfo() {
        System.out.println("Owner: " + owner);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("Active: " + isActive);
    }
}
