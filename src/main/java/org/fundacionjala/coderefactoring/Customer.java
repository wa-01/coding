package org.fundacionjala.coderefactoring;

import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals;

    public Customer(String name, List<Rental> rentals) {
        this.name = name;
        this.rentals = rentals;
    }

    public String statement() {
        StringBuilder statement = new StringBuilder();
        statement.append("Rental record for ").append(name).append("\n");
        getIndividualRentalSummary(statement);
        statement.append("Amount owed is ").append(getTotalAmount()).append("\n");
        statement.append("You earned ").append(getFrequentRenterPoints()).append(" frequent renter points");

        return statement.toString();
    }

    private void getIndividualRentalSummary(StringBuilder statement) {
        for (Rental rental : rentals) {
            statement.append("\t").append(rental.getMovieTitle()).append("\t").append(rental.getAmount()).append("\n");
        }
    }

    private double getTotalAmount() {
        return rentals.stream().mapToDouble(Rental::getAmount).sum();
    }

    private int getFrequentRenterPoints() {
        return rentals.stream().mapToInt(Rental::getRenterPoints).sum();
    }
}
