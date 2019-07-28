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
        Enumeration items = _rentals.elements();
        /*while (items.hasMoreElements()) {
            Rental rent = (Rental) items.nextElement();
            Movie mov = rent.getMovie();
            System.out.println("Adding movie > " + mov.getTitle());
        }
        System.out.println("> > > > ");*/
        return _rentals;
    }

    public double getBill() {
        double bill = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            bill += each.getMovie().getPrice(each.getDaysRented());
        }
        String result = "Rental Record for " + _name + "\n";
        result.concat("Amount owed is  :::   $" + bill + "\n");
        //result.concat("You earned :::   " + customer.getPoints() + " frequent renter points \n");
        System.out.println(result);
        return bill;
    }

    public int getPoints() {
        int frequentRenterPoints = 0;
        Enumeration rentals1 = _rentals.elements();
        while (rentals1.hasMoreElements()) {
            Rental each = (Rental) rentals1.nextElement();
            frequentRenterPoints += each.getMovie().getPoints(each.getDaysRented());
        }
        String result = "Rental Record for " + _name + "\n";
        result.concat("You earned :::   " + frequentRenterPoints + " frequent renter points \n");
        System.out.println(result);
        return frequentRenterPoints;
    }
}
