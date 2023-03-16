import java.util.ArrayList;

public class Building {

    private final int rooms;
    private final int numberOfBathrooms;
    private final int numberOfFloors;
    private final boolean isOfficeBuilding;

    public Building(int rooms, int numberOfBathrooms, int numberOfFloors,boolean isOfficeBuilding){

        this.rooms = rooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = true;

    }

    public int getRooms() {
        return rooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isOfficeBuilding() {
        return isOfficeBuilding;
    }
}