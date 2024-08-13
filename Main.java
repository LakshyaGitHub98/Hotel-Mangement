import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel(10); // Initialize hotel with 10 rooms

        boolean exit = false;

        while (!exit) {
            System.out.println("\n1. Book Room\n2. Checkout Room\n3. Check Room Availability\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter room number to book: ");
                    int bookRoomNumber = scanner.nextInt();
                    hotel.bookRoom(bookRoomNumber);
                    break;
                case 2:
                    System.out.print("Enter room number to checkout: ");
                    int checkoutRoomNumber = scanner.nextInt();
                    hotel.checkoutRoom(checkoutRoomNumber);
                    break;
                case 3:
                    hotel.checkRoomAvailability();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for using the Hotel Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
