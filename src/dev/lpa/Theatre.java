package dev.lpa;

public class Theatre {
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


// has set of seats
// Seat class should be nested class on Theatre
// Seat constructed with row char and a seat number integer
// Each seat has a string - a seat number - in the format "A005", where A is the row number, and 005 is seat
// %number. Zero padded up to three digits.
// Seat also has isReserved boolean


