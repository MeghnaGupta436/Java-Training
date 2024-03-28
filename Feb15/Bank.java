package Feb15;
import java.util.*;
class Account {
    private String name;
    private String accountNumber;
    private double balance;
    public Account(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
    public String getAccountInfo() {
        return "Name: " + name + ", Account Number: " + accountNumber + ", Balance: " + balance;
    }
}
//Bank.java
public class Bank {
    private ArrayList < Account > accounts;
    public Bank() {
        accounts = new ArrayList < Account > ();
    }
    public void addAccount(Account account) {
        accounts.add(account);
    }
    public void removeAccount(Account account) {
        accounts.remove(account);
    }
    public void depositMoney(Account account, double amount) {
        account.deposit(amount);
    }
    public void withdrawMoney(Account account, double amount) {
        account.withdraw(amount);
    }
    public ArrayList < Account > getAccounts() {
        return accounts;
    }
}
class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account("Peter Irmgard", "C0011", 5000);
        Account account2 = new Account("Katja Ruedi", "C0121", 4500);
        Account account3 = new Account("Marcella Gebhard", "C0222", 20000);

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);
        ArrayList < Account > accounts = bank.getAccounts();
        for (Account account: accounts) {
            System.out.println(account.getAccountInfo());
        }
        System.out.println("\nAfter depositing 1000 into account1:");
        bank.depositMoney(account1, 1000);
        System.out.println(account1.getAccountInfo());
        System.out.println("No transaction in account2:");
        System.out.println(account2.getAccountInfo());
        System.out.println("After withdrawing 5000 from account3:");
        bank.withdrawMoney(account3, 5000);
        System.out.println(account3.getAccountInfo());
    }
}