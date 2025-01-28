package prog;

class Booking {
    int bookingId;
    int customerId;
    int pickupLocation;
    int dropLocation;
    int pickupTime;
    int dropTime;
    int amount;

    public Booking(int bookingId, int customerId, int pickupLocation, int dropLocation, int pickupTime) {
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.pickupTime = pickupTime;

        int distance = Math.abs(dropLocation - pickupLocation) * 15;
        this.amount = 100 + (distance - 5) * 10;
        this.dropTime = pickupTime + Math.abs(dropLocation - pickupLocation) * 1;
    }

    @Override
    public String toString() {
        return bookingId + "    " + customerId + "    " + (char) (pickupLocation + 'A') + "    " + (char) (dropLocation + 'A') +
               "    " + pickupTime + "    " + dropTime + "    " + amount;
    }
}
