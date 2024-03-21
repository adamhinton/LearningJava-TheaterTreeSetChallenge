package dev.lpa;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Theatre {

    private String theatreName;
    // uniform in all rows
    private int seatsInRow;
    private NavigableSet<Seat> seats = new TreeSet<>();



    public Theatre(String theatreName, int numRows, int totalSeats) {
        this.theatreName = theatreName;
        this.seatsInRow = (int) totalSeats / numRows;

        for (int row = 1; row <= numRows; row++) {
            for (int seatNum = 1; seatNum <= seatsInRow; seatNum++) {
                char seatLetter = (char) ('A' + seatNum - 1);
                Seat seat = new Seat(seatLetter, seatNum);
                seats.add(seat);
            }
        }



    }

    class Seat implements Comparable<Seat>{

        private String seatNumberStr;
        private boolean isReserved = false;

        public Seat(char row, int seatNumber) {
            // Format the seatNumber to always be three digits
            this.seatNumberStr = String.format("%c%03d", row, seatNumber);
        }

        @Override
        public int compareTo(Seat o) {
            return this.seatNumberStr.compareTo(o.seatNumberStr);
        }
    }

        // has set of seats
    // Seat class should be nested class on Theatre
        // Seat constructed with row char and a seat number integer
        // Each seat has a string - a seat number - in the format "A005", where A is the row number, and 005 is seat
        // %number. Zero padded up to three digits.
        // Seat also has isReserved boolean




}




// Challenge specs

// class Theatre
    // Three fields?
        // theatreName
        // seatsInRow int
        // field for the seats themselves
            // TreeSet
    // Constructor:
        // theatre name, numRows, numSeats total in theater
        // Assume uniform seats per row; numRows should never exceed 26 so will be labeled A-Z
    // Create the seats, and number them, as part of initialization of Theatre class
    // Should also have printSeatMap method that prints each seat, with seat row printed on a separate line.
    // Allow a booking agent to reserve a single seat, and seat map shows which ones are reserved.



