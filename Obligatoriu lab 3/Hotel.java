package com.company;

import java.time.LocalTime;

public class Hotel extends Location implements Visitable, Payable, Classifiable {

    private LocalTime openingTime, closingTime;
    private double ticketPrice;
    int Rank;

    @Override
    public LocalTime getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(LocalTime openingTime) {
        this.openingTime = openingTime;
    }

    @Override
    public LocalTime getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(LocalTime closingTime) {
        this.closingTime = closingTime;
    }

    @Override
    public double getTicketPrice() {
        return ticketPrice;
    }

    @Override
    public int getRank() {
        return Rank;
    }
}