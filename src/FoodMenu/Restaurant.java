package FoodMenu;

import java.util.ArrayList;

public class Restaurant {
    public ArrayList<String> items;
    public ArrayList<Double> prices;
    public ArrayList<Integer> ratings;
    public ArrayList<Integer> ratingCounter;

    public Restaurant(){
        this.items = new ArrayList<>();
        this.prices = new ArrayList<>();
        this.ratings = new ArrayList<>();
        this.ratingCounter = new ArrayList<>();
    }

    public void addItem(String item, double price){
        this.items.add(item);
        this.prices.add(price);
        this.ratings.add(0);
        this.ratingCounter.add(0);
    }

    public void removeItem(String item){
        int index = items.indexOf(item);
        this.items.remove(index);
        this.prices.remove(index);
        this.ratings.remove(index);
        this.ratingCounter.remove(index);
    }

    public void addRating(String item, int rating){
        int index = this.items.indexOf(item);
        int currentRating = this.ratings.get(index);
        int totalCount = this.ratingCounter.get(index);

        this.ratings.set(index, currentRating + rating);
        this.ratingCounter.set(index, totalCount + 1);
    }

    public void printMenu(){
        System.out.println("Menu");
        for (int i = 0; i < items.size(); i++){
            double averageRating = ratingCounter.get(i) == 0 ? 0 : (double)ratings.get(i) / (double)ratingCounter.get(i);
            System.out.println(items.get(i) + " - £" + prices.get(i) + " (" + averageRating + ")");
        }
    }
}