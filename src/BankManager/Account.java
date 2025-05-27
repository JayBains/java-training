package BankManager;

public class Account {
    protected final int accountNumber;
    protected String accountHolder;
    protected double balance;

    public Account(int accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountDetails() {
        return "Account number: " + accountNumber + "\nAccount holder: " + accountHolder + "\nAccount balance: " + getBalance();
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        if (amount <= 0){
            System.out.println("Error: Please enter a valid amount");
            return;
        }
        balance += amount;
        System.out.println(accountHolder + " deposit Successful. New balance: £" + balance);
    }

    public void withdraw(double amount){
        if (balance - amount < 0) {
            System.out.println("Error: Not enough money in account to withdraw £" + amount);
            return;
        }
        balance -= amount;
        System.out.println(accountHolder + " withdrawal successful. New balance: £" + balance);
    }

    @Override
    public String toString(){
        return accountHolder;
    }
}
