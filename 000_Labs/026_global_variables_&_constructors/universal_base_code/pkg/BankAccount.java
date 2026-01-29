package pkg;
import java.util.Random;

public class BankAccount {

    private String owner;
    private int accountNumber;
    private double balance;
    private boolean isActive;

    private static int nextAccountNumber = new Random().nextInt(951) + 50;

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

    public BankAccount(String ownerName, double iDeposit) {
        owner = ownerName;
        balance = iDeposit;
        isActive = true;
        accountNumber = nextAccountNumber;
        nextAccountNumber++;
    }

    public String getOwner() {
        return owner;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void info() {
        System.out.println("Owner: " + owner);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("Active: " + isActive);
    }
}
