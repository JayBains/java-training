package Carpark;

/*
Try designing a parking lot where it will have multiple floors and each floor has multiple parking slots.
Whenever you park a car, you need to make that slot occupied. Once you unpark, you need to make that slot available.
If the parking lot is full, you need to print no available slots.
This problem requires using of hashmap and lists
*/

public class Main {
    public static void main(String[] args) {
        CarPark test = new CarPark(3, 2);

        Car polo = new Car("WR55WSZ");
        Car golf = new Car("BT55USB");
        Car tiguan = new Car("GG69ONG");

        test.addCar(polo);
        test.addCar(golf);
        test.addCar(tiguan);

        test.checkSpaces();

        test.removeCar(golf);

        test.checkParkedCars();
    }
}