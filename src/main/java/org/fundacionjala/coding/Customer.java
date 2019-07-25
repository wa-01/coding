package org.fundacionjala.coding;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> myRentals = new ArrayList<Rental>();

    public Customer(final String name) {
        this.name = name;
    }

    public void addRental(final Rental rental) {
        myRentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public String getStatement() {
        String name = getName();
        String result = getHeader(name);

        for (Rental each: myRentals) {
            double amount = each.getAmount();
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(amount) + "\n";
        }

        double totalAmount = getTotalAmount(myRentals);
        int frequentRenterPoints = getFrequentRenterPoints(myRentals);

        result += getFooter(totalAmount, frequentRenterPoints);
        return result;
    }

    private double getTotalAmount(final Iterable<Rental> rentals) {
        double totalAmount = 0;
        for (Rental each: rentals) {
            double amount = each.getAmount();
            totalAmount += amount;
        }
        return  totalAmount;
    }

    private int getFrequentRenterPoints(final List<Rental> myRentals) {
        int frequentRenterPoints = 0;
        for (Rental each: myRentals) {
            frequentRenterPoints++;
            if (each.getMovie().getPriceCode() == Movie.NEW_RELEASE && each.getDaysRented() > 1) {
                frequentRenterPoints++;
            }
        }
        return frequentRenterPoints;
    }

    private String getHeader(final String name) {
        return "Rental Record for " + name + "\n";
    }

    private  String getFooter(double totalAmount, int frequentRenterPoints) {
        String line1 = "Amount owed is " + String.valueOf(totalAmount) + "\n";
        String line2 = "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return line1 + line2;
    }
}
