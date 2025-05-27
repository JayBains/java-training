package BankManager;

public class Main {
    public static void main(String[] args) {

        Account jay = new Account(0, "Jay", 100);
        Account tas = new Account(1, "Tas", 50000);
        Account harms = new Account(2, "Harms", 50000);

        jay.deposit(25.50);
        jay.withdraw(500);
        jay.withdraw(50);

        Savings Peen = new Savings(3, "Peen", 100000, 5.5);
        Savings Ree = new Savings(4, "Ree", 1, 5.5);

        System.out.println(Peen.getAccountDetails());
        System.out.println("Interest rate: " + Peen.getInterest()/100 + "%");
        Peen.applyInterest();

        Bank hsb = new Bank();

        hsb.addAccount(jay);
        hsb.addAccount(tas);
        hsb.addAccount(harms);
        hsb.addAccount(Peen);
        hsb.addAccount(Ree);
        System.out.println(hsb.getAccounts());
        hsb.applyInterestRate(Ree);
        hsb.removeAccount(Ree);
        System.out.println(hsb.getAccounts());

        hsb.applyInterestRate();
        hsb.withdrawMoney(Peen, 50);

    }
}