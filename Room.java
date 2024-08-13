public class Room {
    private int roomNumber;
    private boolean isBooked;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isBooked = false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void bookRoom() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Room " + roomNumber + " booked successfully.");
        } else {
            System.out.println("Room " + roomNumber + " is already booked.");
        }
    }

    public void checkoutRoom() {
        if (isBooked) {
            isBooked = false;
            System.out.println("Room " + roomNumber + " checked out successfully.");
        } else {
            System.out.println("Room " + roomNumber + " is not booked.");
        }
    }
}
