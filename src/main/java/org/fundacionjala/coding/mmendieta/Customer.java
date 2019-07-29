package org.fundacionjala.coding.mmendieta;

import java.util.ArrayList;
import java.util.List;

class Customer {
    private final String name;
    private final List<Rental> rentalList;
    private double totalAmount;
    private int frequentRenterPoints;
    private String result;

    Customer(final String name) {
        this.name = name;
        this.rentalList = new ArrayList<>();
        this.totalAmount = 0;
        this.frequentRenterPoints = 0;
        this.result = "Rental Record for " + getName() + "\n";
    }

    void addRental(final Rental rental) {
        rentalList.add(rental);
    }

    String getName() {
        return name;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public int getFrequentRenterPoints() {
        return frequentRenterPoints;
    }

    String statement() {
        calculateTotalAmount();
        calculateFrequentRenterPoints();
        setCustomerStatement();
        return result;
    }

    private void calculateTotalAmount() {
        for (Rental rental : rentalList) {
            totalAmount += rental.getMovie().getAmountOwed(rental.getDaysRented());
        }
    }

    private void calculateFrequentRenterPoints() {
        for (Rental rental : rentalList) {
            frequentRenterPoints++;
            if ((rental.getMovie() instanceof MovieNewRelease)
                    &&
                    rental.getDaysRented() > 1) {
                frequentRenterPoints++;
            }
        }
    }

    private void setCustomerStatement() {
        for (Rental rental : rentalList) {
            result += "\t"
                    + rental.getMovie().getTitle() + "\t"
                    + rental.getMovie().getAmountOwed(rental.getDaysRented())
                    + "\n";
        }
        result += "Amount owed is "
                + totalAmount
                + "\n";
        result += "You earned " + frequentRenterPoints
                + " frequent renter points";
    }
}
