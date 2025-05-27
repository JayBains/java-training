package PurchaseHistory;

import java.util.ArrayList;

public class Customer {
    private String name;
    private String email;
    private ArrayList<Double> purchaseHistory;

    public Customer(String name, String email){
        this.name = name;
        this.email = email;
        this.purchaseHistory = new ArrayList<>();
    }

    public String getCustomer(){
        return "Name: " + name + "\nEmail: " + email;
    }

    public ArrayList<Double> getPurchaseHistory(){
        return purchaseHistory;
    }

    public void purchase(double amount){
        purchaseHistory.add(amount);
    }

    public double sumOfPurchases(){
        double sum = 0;
        //    (enhanced for loop?)
        for (Double aDouble : purchaseHistory) {
            sum += aDouble;
        }
        return sum;
    }

}
