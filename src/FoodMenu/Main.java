package FoodMenu;

public class Main {
    public static void main(String[] args) {
        Restaurant McDon = new Restaurant();
        McDon.addItem("borgir", 1.99);
        McDon.addItem("chips", 0.99);
        McDon.addItem("drink", 0.99);
        McDon.addItem("toy", 3);

        McDon.removeItem("toy");

        McDon.addRating("borgir", 5);
        McDon.addRating("borgir", 1);

        McDon.printMenu();
    }
}