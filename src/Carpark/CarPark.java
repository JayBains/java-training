package Carpark;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarPark {
    private final int floors;
    private final int spacesPerFloor;
    private final Map<Integer, List<ParkingSpace>> parkingSpaces;
    private final Map<Car, ParkingSpace> parkedCars;

    public CarPark(int floors, int spacesPerFloor) {
        this.floors = floors;
        this.spacesPerFloor = spacesPerFloor;
        this.parkingSpaces = new HashMap<>();
        this.parkedCars = new HashMap<>();

        for (int floor = 0; floor < floors; floor++) {
            List<ParkingSpace> spaces = new ArrayList<>();
            for (int slot = 0; slot < spacesPerFloor; slot++) {
                spaces.add(new ParkingSpace(floor, slot));
            }
            parkingSpaces.put(floor, spaces);
        }
    }

    public void checkSpaces(){
        for (int floor = 0; floor < floors; floor++){
            System.out.println("Floor " + floor);
            for (ParkingSpace space : parkingSpaces.get(floor)){
                String status = space.occupied ? "Occupied" : "Available";
                System.out.println("Slot " + space.getSlot() + ": " + status);
            }
        }
    }

    public void addCar(Car car){
        if(parkedCars.size() >= floors*spacesPerFloor){
            System.out.println("No slots available.");
            return;
        }

        for (int floor = 0; floor < floors; floor++){
            for (ParkingSpace space : parkingSpaces.get(floor)){
                if(!space.occupied){
                    space.occupied = true;
                    parkedCars.put(car, space);
                    System.out.println("Car parked at Floor " + floor + " Slot " + space.getSlot());
                    return;
                }
            }
        }
    }

    public void removeCar(Car car){
        ParkingSpace space = parkedCars.remove(car);

        if(space != null) {
            space.occupied = false;
            System.out.println("Car removed from Floor " + space.getFloor() + " Slot " + space.getSlot());
        }
    }

    public void checkParkedCars(){
        if (parkedCars.isEmpty()){
            System.out.println("Car park is empty.");
            return;
        }

        for (Car car : parkedCars.keySet()){
            ParkingSpace space = parkedCars.get(car);
            System.out.println(car.getRegistration() + " (Floor " + space.getFloor() + ", Slot " + space.getSlot() + ")");
        }
    }
}
