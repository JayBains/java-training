package Carpark;

public class ParkingSpace {
    int floor;
    int slot;
    boolean occupied;

    public ParkingSpace(int floor, int slot){
        this.floor = floor;
        this.slot = slot;
        this.occupied = false;
    }

    public int getFloor() {
        return floor;
    }

    public int getSlot() {
        return slot;
    }
}
