package org.fundacionjala.coding.mmendieta;

import java.util.ArrayList;
import java.util.List;

class Customer {
    private final String name;
    private final List<Rental> rentalList;
    private double totalAmount;
    private int frequentRenterPoints;
    private StringBuilder result;

    Customer(final String name) {
        this.name = name;
        this.rentalList = new ArrayList<>();
        this.totalAmount = 0;
        this.frequentRenterPoints = 0;
        this.result = new StringBuilder("Rental Record for " + getName() + "\n");
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
        for (Rental rental : rentalList) {
            calculateTotalAmount(rental);
            calculateFrequentRenterPoints(rental);
            setCustomerStatement(rental);
        }
        result.append("Amount owed is ");
        result.append(totalAmount);
        result.append("\n");
        result.append("You earned ");
        result.append(frequentRenterPoints);
        result.append(" frequent renter points");
        return result.toString();
    }

    private void calculateTotalAmount(final Rental rental) {
        totalAmount += rental.getMovie().getAmountOwed(rental.getDaysRented());
    }

    private void calculateFrequentRenterPoints(final Rental rental) {
        frequentRenterPoints += rental.getFrequentRentalPoints();
    }

    private void setCustomerStatement(final Rental rental) {
        result.append("\t");
        result.append(rental.getMovie().getTitle());
        result.append("\t");
        result.append(rental.getMovie().getAmountOwed(rental.getDaysRented()));
        result.append("\n");
    }
}
