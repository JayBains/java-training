package PurchaseHistory;// Write a Java program to create a class called "Customer" with attributes for
// name, email, and purchase history. Implement methods to add purchases to
// the history and calculate total expenditure. Create a subclass "LoyalCustomer"
// that adds a discount rate attribute and a method to apply the discount.

public class Main {
    public static void main(String[] args) {
        Customer ben = new Customer("Ben", "ben@comitfs.com");
        ben.purchase(4.20);
        ben.purchase(6.9);
        ben.purchase(2000);
        System.out.println(ben.getCustomer());
        System.out.println(ben.getPurchaseHistory());
        System.out.println(ben.sumOfPurchases());

        LoyalCustomer kate = new LoyalCustomer("Kate", "kate@comitfs.com", 0.0);
        System.out.println(kate.getCustomer());
        kate.setDiscount(20);
        System.out.println(kate.getDiscount());
        kate.purchase(100);
        kate.purchase(200);
        System.out.println(kate.getPurchaseHistory());
        System.out.println(kate.sumOfPurchases());
    }
}