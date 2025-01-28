package prog;
import java.util.ArrayList;
import java.util.List;

class Taxi {
    int taxiNo;
    int location; // 0 for A, 1 for B, ..., 5 for F
    int totalEarnings;
    List<Booking> bookings;

    public Taxi(int taxiNo) {
        this.taxiNo = taxiNo;
        this.location = 0; // Initially at A
        this.totalEarnings = 0;
        this.bookings = new ArrayList<>();
    }

    public boolean isAvailable(int pickupTime, int pickupLocation) {
        if (bookings.isEmpty()) return true;

        Booking lastBooking = bookings.get(bookings.size() - 1);
        int dropTime = lastBooking.dropTime;
        int travelTime = Math.abs(pickupLocation - lastBooking.dropLocation) * 1;

        return (pickupTime >= dropTime + travelTime);
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
        totalEarnings += booking.amount;
        location = booking.dropLocation;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Taxi-").append(taxiNo).append(" Total Earnings: Rs. ").append(totalEarnings).append("\n");
        for (Booking b : bookings) {
            sb.append(b).append("\n");
        }
        return sb.toString();
    }
}
