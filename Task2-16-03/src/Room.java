public class Room {

    private final int numberOfDoors;
    private final int numberOfLamps;
    private final int numberOfWindows;

    public Room(int numberOfDoors, int numberOfLamps, int numberOfWindows) {

        this.numberOfDoors = numberOfDoors;
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;

    }


    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberOfLamps() {
        return numberOfLamps;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }
}