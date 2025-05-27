package PurchaseHistory;

public class LoyalCustomer extends Customer{
    private Double discount;

    public LoyalCustomer(String name, String email, Double discount) {
        super(name, email);
        this.discount = discount;
    }

    public double getDiscount(){
        return discount;
    }

    public void setDiscount(double amount){
        this.discount = amount;
    }

    @Override
    public void purchase(double amount){
        super.purchase((amount - (amount*discount/100)));
    }
}
