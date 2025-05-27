package BankManager;

public class Savings extends Account {
    private double interest;

    public Savings(int accountNumber, String accountHolder, double balance, double interest) {
        super(accountNumber, accountHolder, balance);
        this.interest = interest;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        if (interest < 0){
            System.out.println("Error: interest rate must be positive");
            return;
        }
        this.interest = interest;
    }

    public void applyInterest(){
        deposit((getBalance() * (interest/100)));
    }

}
