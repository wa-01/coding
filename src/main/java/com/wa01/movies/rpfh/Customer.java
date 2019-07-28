package com.wa01.movies.rpfh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.Enumeration;
import java.util.Vector;

class Customer {
    private final String name;
    //private final Vector rentals = new Vector();
    private final ArrayList <Rental> rentals = new ArrayList<Rental>();
    private final static Logger logger = Logger.getLogger("com.wa01.movies.rpfh.Customer");

    public Customer(String name) {
        this.name = name;
    }
    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Rental> getRentals() {
        return rentals;
    }

    public double getBill() {
        double bill = 0;
        Iterator rentalsE = rentals.iterator();
        while (rentalsE.hasNext()) {
            Rental each = (Rental) rentalsE.next();
            bill += each.getMovie().getPrice(each.getDaysRented());
        }
        logger.log(Level.INFO,"Amount owed is  :::   $" + bill + "\n");
        return bill;
    }

    public int getPoints() {
        int frequentRenterPoints = 0;
        Iterator rentalsE = rentals.iterator();
        while (rentalsE.hasNext()) {
            Rental each = (Rental) rentalsE.next();
            frequentRenterPoints += each.getMovie().getPoints(each.getDaysRented());
        }
        logger.log(Level.INFO,"You earned :::   " + frequentRenterPoints + " frequent renter points \n");
        return frequentRenterPoints;
    }
}
