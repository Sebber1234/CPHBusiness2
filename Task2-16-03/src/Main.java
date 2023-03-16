import java.util.ArrayList;

public class Main {

    private static final ArrayList<Room> Rooms = new ArrayList<>();

    static Room room = new Room(10, 7,20);
    static Room room1 = new Room(5, 6,10);
    static Room room2 = new Room(30, 20,50);

    static Building BurjKhalifa = new Building(900,1800,163, false);



    public static void main(String[] args) {

        Rooms.add(room);
        Rooms.add(room1);
        Rooms.add(room2);

    }
    public static int countLampsInBuilding(){
        int totalLamps = 0;

        for (Room value : Rooms) {

            totalLamps += value.getNumberOfLamps();

        }
        return totalLamps;
    }
    public static boolean isNormal(Building building) {
        int totalRooms = Rooms.size() + building.getNumberOfBathrooms();
        int totalFloors = building.getNumberOfFloors();


        if (totalRooms < totalFloors) {

            return true;


        } else {

            System.out.println(" This is an odd building");

            return false;

        }
    }
}
