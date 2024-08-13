import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Room> rooms;

    public Hotel(int numberOfRooms) {
        rooms = new ArrayList<>();
        for (int i = 1; i <= numberOfRooms; i++) {
            rooms.add(new Room(i));
        }
    }

    public void bookRoom(int roomNumber) {
        if (roomNumber > 0 && roomNumber <= rooms.size()) {
            rooms.get(roomNumber - 1).bookRoom();
        } else {
            System.out.println("Invalid room number.");
        }
    }

    public void checkoutRoom(int roomNumber) {
        if (roomNumber > 0 && roomNumber <= rooms.size()) {
            rooms.get(roomNumber - 1).checkoutRoom();
        } else {
            System.out.println("Invalid room number.");
        }
    }

    public void checkRoomAvailability() {
        for (Room room : rooms) {
            System.out.println("Room " + room.getRoomNumber() + ": " + (room.isBooked() ? "Booked" : "Available"));
        }
    }
}
