package com.wa01.movies.rpfh;

import java.util.Enumeration;
import java.util.Vector;

class Customer {
    private String _name;
    private Vector _rentals = new Vector();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    public Vector getRentals() {
        return _rentals;
    }

    public double getBill() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        double bill = 0;
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            bill += each.getMovie().getPrice(each.getDaysRented());
        }
        return bill;
    }

    public int getPoints() {
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            frequentRenterPoints += each.getMovie().getPoints(each.getDaysRented());
        }
        return frequentRenterPoints;
    }
}
