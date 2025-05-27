package BankManager;

import java.util.ArrayList;

public class Bank {
    private final ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<Account>();
    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    public void removeAccount(Account account){
        if (!accounts.contains(account)){
            System.out.println("Error: Account does not exist");
            return;
        }
        accounts.remove(account);
    }

    public void depositMoney(Account account, double amount) {
        account.deposit(amount);
    }

    public void withdrawMoney(Account account, double amount) {
        account.withdraw(amount);
    }

    public ArrayList<Account> getAccounts(){
        return accounts;
    }

    public void applyInterestRate(Savings savings){
        savings.applyInterest();
    }

    public void applyInterestRate() {
        for (Account account : accounts) {
            if (account instanceof Savings) {
                ((Savings) account).applyInterest();
            }
        }
    }
}
