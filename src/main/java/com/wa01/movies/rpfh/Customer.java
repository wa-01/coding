package com.wa01.movies.rpfh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

class Customer {
    private final String name;
    private final List<Rental> rentals = new ArrayList<>();
    private static final Logger LOGGER = Logger.getLogger("com.wa01.movies.rpfh.Customer");

    public Customer(final String name) {
        this.name = name;
    }

    public void addRental(final Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public double getBill() {
        double bill = 0;
        Iterator rentalsE = rentals.iterator();
        while (rentalsE.hasNext()) {
            Rental each = (Rental) rentalsE.next();
            bill += each.getMovie().getPrice(each.getDaysRented());
        }
        String message = "Amount owed is  :::   $" + bill + "\n";
        LOGGER.log(Level.INFO, () -> message);
        return bill;
    }

    public int getPoints() {
        int frequentRenterPoints = 0;
        Iterator rentalsE = rentals.iterator();
        while (rentalsE.hasNext()) {
            Rental each = (Rental) rentalsE.next();
            frequentRenterPoints += each.getMovie().getPoints(each.getDaysRented());
        }
        String message = "You earned :::   " + frequentRenterPoints + " frequent renter points \n";
        LOGGER.log(Level.INFO, () -> message);
        return frequentRenterPoints;
    }
}
