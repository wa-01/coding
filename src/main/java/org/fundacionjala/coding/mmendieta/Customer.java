package org.fundacionjala.coding.mmendieta;

import java.util.ArrayList;
import java.util.List;

class Customer {
    private final String name;
    private final List<Rental> rentalList = new ArrayList<>();

    Customer(final String name) {
        this.name = name;
    }

    void addRental(final Rental rental) {
        rentalList.add(rental);
    }

    String getName() {
        return name;
    }

    String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        String result = "Rental Record for " + getName() + "\n";
        for (Rental rental : rentalList) {
            double thisAmount = rental.getMovie().getAmountOwed(rental.getDaysRented());
            // add frequent renter points
            frequentRenterPoints++;
            // add bonus for a two day new release rental
            if ((rental.getMovie() instanceof MovieNewRelease)
                    &&
                    rental.getDaysRented() > 1) {
                frequentRenterPoints++;
            }
            //show figures for this rental
            result += "\t"
                    + rental.getMovie().getTitle() + "\t"
                    + String.valueOf(thisAmount)
                    + "\n";
            totalAmount += thisAmount;
        }
        //add footer lines
        result += "Amount owed is "
                + totalAmount
                + "\n";
        result += "You earned " + frequentRenterPoints
                + " frequent renter points";
        return result;
    }
}
