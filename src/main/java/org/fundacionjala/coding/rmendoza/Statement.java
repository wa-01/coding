package org.fundacionjala.coding.rmendoza;

import java.util.ArrayList;
import java.util.List;

class Statement extends Customer{

    private final List<Rental> rentalList;
    private double totalStatement;
    private int frequentRenterPoints;
    private StringBuilder result;

    Statement(final String customer) {
        super(customer);
        this.rentalList = new ArrayList<>();
        this.totalStatement = 0;
        this.frequentRenterPoints = 0;
        this.result = new StringBuilder("Rental Record for " + customer + "\n");
    }

    void addRental(final Rental rental) {
        rentalList.add(rental);
    }

    public double getTotalStatement() {
        return totalStatement;
    }

    public int getFrequentRenterPoints() {
        return frequentRenterPoints;
    }

    String statement() {
        for (Rental rental : rentalList) {
            calculateTotalAmount(rental);
            calculateFrequentRenterPoints(rental);
            customerStatement(rental);
        }
        result.append("Amount owed is ");
        result.append(totalStatement);
        result.append("\n");
        result.append("You earned ");
        result.append(frequentRenterPoints);
        result.append(" frequent renter points");
        return result.toString();
    }

    private void calculateTotalAmount(final Rental rental) {
        totalStatement += rental.getMovie().getAmountOwed(rental.getDaysRented());
    }

    private void calculateFrequentRenterPoints(final Rental rental) {
        frequentRenterPoints += rental.getFrequentRentalPoints();
    }

    private void customerStatement(final Rental rental) {
        result.append("\t");
        result.append(rental.getMovie().getMovieTitle());
        result.append("\t");
        result.append(rental.getMovie().getAmountOwed(rental.getDaysRented()));
        result.append("\n");
    }
}
