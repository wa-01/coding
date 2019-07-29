package org.fundacionjala.coding.acamacho;

import java.util.ArrayList;
import java.util.List;

class Customer {
    private String name;
    private List<Rental> rentalList = new ArrayList<>();

    public Customer(final String name) {
        this.name = name;
    }

    public void addRental(final Rental rental) {
        rentalList.add(rental);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        double totalAmount = 0;

        StringBuilder result = new StringBuilder(buildMessage());
        for (Rental rental : rentalList) {
            double thisAmount = rental.calculateAmount();
            result.append("\t").append(rental.getMovie().getTitle()).append("\t").append(thisAmount).append("\n");
            totalAmount += thisAmount;
        }

        int frequentRenterPoints = calculateFrequentRenterPoints();

        result.append(buildMessage(totalAmount, frequentRenterPoints));
        return result.toString();
    }

    private int calculateFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        for (Rental rental : rentalList) {
            frequentRenterPoints++;
            // add bonus for a two day new release rental
            if ((rental.getMovie().getCategory() == Category.NEW_RELEASE) && rental.getDaysRented() > 1) {
                frequentRenterPoints++;
            }
        }
        return frequentRenterPoints;
    }

    private String buildMessage(double amount, int frequentPoints) {
        String message1 = "Amount owed is " + amount + "\n";
        String message2 = "You earned " + frequentPoints + " frequent renter points";
        return message1 + message2;
    }

    private String buildMessage() {
        return "Rental Record for " + getName() + "\n";
    }
}
