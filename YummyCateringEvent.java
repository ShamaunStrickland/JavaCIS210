public class YummyCateringEvent {
    public final static double price_perguest = 35.0;
    public final static int Event_range = 50;
    private String eventNumber;
    private int numberOfGuests;
    private double price;
    public void setEventNumber(String eventNumber) {
        this.eventNumber = eventNumber;
    }
    public void setGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
        calculatePrice();
    }
    public String getEventNumber() {
        return eventNumber;
    }
    public int getNumberOfGuests() {
        return numberOfGuests;
    }
    public double getPrice() {
        return price;
    }
    public YummyCateringEvent(String eventNumber, int numberOfGuests) {
        setEventNumber(eventNumber);
        setGuests(numberOfGuests);
    }
    public YummyCateringEvent() {
        this("A000", 0);
    }
    private void calculatePrice() {
        price = price_perguest * numberOfGuests;
    }
}
