import java.util.Scanner;

public class EventDemo {
    public static void main(String[] args) {
        YummyCateringEvent event1 = new YummyCateringEvent();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter event number: ");
        String eventNumber = scanner.nextLine();
        System.out.print("Enter number of guests: ");
        int numberOfGuests = scanner.nextInt();
        YummyCateringEvent event2 = new YummyCateringEvent(eventNumber, numberOfGuests);
        displayDetails(event1);
        displayDetails(event2);
    }
    public static void displayDetails(YummyCateringEvent event) {
        System.out.println("-------------------------------------------------------");
        System.out.println("Event Number: " + event.getEventNumber());
        System.out.println("Number of Guests: " + event.getNumberOfGuests());
        System.out.println("Price per Guest: $" + YummyCateringEvent.price_perguest);
        System.out.println("Total Price: $" + event.getPrice());

    }
}
