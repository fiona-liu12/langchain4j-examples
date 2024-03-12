package dev.example;

import java.time.LocalDate;

public class Booking {

    private String bookingNumber;
    private LocalDate bookingFrom;
    private LocalDate bookingTo;
    private Customer customer;

    public Booking(String bookingNumber1, LocalDate bookingFrom, LocalDate bookingTo, Customer customer) {
        this.bookingNumber = bookingNumber1;
        this.bookingFrom = bookingFrom;
        this.bookingTo = bookingTo;
        this.customer = customer;
    }
}