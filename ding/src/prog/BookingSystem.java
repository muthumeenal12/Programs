package prog;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class BookingSystem {
    List<Taxi> taxis;
    int bookingIdCounter;

    public BookingSystem(int numberOfTaxis) {
        taxis = new ArrayList<>();
        for (int i = 1; i <= numberOfTaxis; i++) {
            taxis.add(new Taxi(i));
        }
        bookingIdCounter = 1;
    }

    public void bookTaxi(int customerId, char pickupPoint, char dropPoint, int pickupTime) {
        int pickupLocation = pickupPoint - 'A';
        int dropLocation = dropPoint - 'A';

        Taxi selectedTaxi = null;

        for (Taxi taxi : taxis) {
            if (taxi.location == pickupLocation && taxi.isAvailable(pickupTime, pickupLocation)) {
                if (selectedTaxi == null || taxi.totalEarnings < selectedTaxi.totalEarnings) {
                    selectedTaxi = taxi;
                }
            }
        }

        if (selectedTaxi == null) {
            int minDistance = Integer.MAX_VALUE;
            for (Taxi taxi : taxis) {
                int distance = Math.abs(taxi.location - pickupLocation);
                if (taxi.isAvailable(pickupTime, pickupLocation) && distance < minDistance) {
                    minDistance = distance;
                    selectedTaxi = taxi;
                } else if (taxi.isAvailable(pickupTime, pickupLocation) && distance == minDistance && taxi.totalEarnings < selectedTaxi.totalEarnings) {
                    selectedTaxi = taxi;
                }
            }
        }

        if (selectedTaxi != null) {
            Booking booking = new Booking(bookingIdCounter++, customerId, pickupLocation, dropLocation, pickupTime);
            selectedTaxi.addBooking(booking);
            System.out.println("Taxi can be allotted.");
            System.out.println("Taxi-" + selectedTaxi.taxiNo + " is allotted");
        } else {
            System.out.println("No Taxi available.");
        }
    }

    public void displayTaxiDetails() {
        for (Taxi taxi : taxis) {
            System.out.println(taxi);
        }
    }
}
