package pl.czacza;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Cinema {

    private String name;
    private List<TheSeat> seats = new ArrayList<>();

    public Cinema(String name, int numRows, int seatsPerRow) {
        this.name = name;
        int lastRow = 'A' + (numRows - 1);

        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 0; seatNum < seatsPerRow; seatNum++) {
                TheSeat newSeat = new TheSeat(row + String.format("%02d", seatNum));
                seats.add(newSeat);
            }
        }
    }

    public void getSeats() {
        for (TheSeat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
    }

    public boolean reserveSeat(String seatNumber) {
        TheSeat requestedSeat = new TheSeat(seatNumber);
        int position = Collections.binarySearch(seats, requestedSeat, null);
        if (position >= 0) {
            return seats.get(position).reserve();
        } else {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }

    }


    private class TheSeat implements Comparable<TheSeat> {
        private final String seatNumber;
        private boolean isReserved = false;

        public TheSeat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public boolean reserve() {
            if (!isReserved) {
                System.out.println("Seat " + seatNumber + " reserved");
                isReserved = true;
                return true;
            } else {
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        @Override
        public int compareTo(TheSeat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.seatNumber);
        }
    }
}
