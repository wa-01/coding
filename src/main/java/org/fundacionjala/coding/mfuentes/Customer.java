package org.fundacionjala.coding.mfuentes;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String customerName;

    private List<Rental> myRentals = new ArrayList<>();

    public Customer(String name) {
        customerName = name;
    }

    public void addRental(Rental rental) {
        myRentals.add(rental);
    }

    public String getName() {
        return customerName;
    }

    public String statement() {

        String name = getName();
        StringBuilder result = new StringBuilder(header(name));

        for (Rental each : myRentals) {
            double thisAmount = each.amount();
            result.append("\t").append(each.getMovie().getTitle()).append("\t").append(thisAmount).append("\n");
        }

        double totalAmount = totalAmount(this.myRentals);

        int frequentRenterPoints = frequentRenterPoints(this.myRentals);

        result.append(footer(totalAmount, frequentRenterPoints));

        return result.toString();
    }

    private double totalAmount(Iterable<Rental> rentals) {
        double totalAmount = 0;
        for (Rental each : rentals) {
            double thisAmount = each.amount();
            totalAmount += thisAmount;
        }
        return totalAmount;
    }

    private int frequentRenterPoints(List<Rental> myRentals1) {
        int totalRenterPoints = 0;
        for (Rental each : myRentals1) {
            totalRenterPoints += each.renterPoints();
        }
        return totalRenterPoints;
    }

    private String header(String name) {
        return "Rental Record for " + name + "\n";
    }

    private String footer(double totalAmount, int frequentRenterPoints) {
        String footer1 = "Amount owed is " + totalAmount
                +
                "\n";
        String footer2 = "You earned " + frequentRenterPoints
                +
                " frequent renter points";
        return footer1 + footer2;
    }
}
