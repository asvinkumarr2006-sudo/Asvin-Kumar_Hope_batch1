class BankAccount {
     private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
       return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}
public class Bank {
    public static void main(String[] args) {
        BankAccount b=new BankAccount("123456",1000000.0);
        System.out.println(b.getAccountNumber());
        System.out.println(b.getBalance());
        b.deposit(5000.0);
        b.withdraw(2000.0);
        System.out.println(b.getBalance());
    }
}
