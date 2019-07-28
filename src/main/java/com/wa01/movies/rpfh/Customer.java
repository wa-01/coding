package com.wa01.movies.rpfh;

import java.util.Enumeration;
import java.util.Vector;

class Customer {
    private final String name;
    private final Vector rentals = new Vector();

    public Customer(String name) {
        this.name = name;
    }
    public void addRental(Rental arg) {
        rentals.addElement(arg);
    }

    public String getName() {
        return name;
    }

    public Vector getRentals() {
        Enumeration items = rentals.elements();
        /*while (items.hasMoreElements()) {
            Rental rent = (Rental) items.nextElement();
            Movie mov = rent.getMovie();
            System.out.println("Adding movie > " + mov.getTitle());
        }
        System.out.println("> > > > ");*/
        return rentals;
    }

    public double getBill() {
        double bill = 0;
        Enumeration rentalsE = rentals.elements();
        while (rentalsE.hasMoreElements()) {
            Rental each = (Rental) rentalsE.nextElement();
            bill += each.getMovie().getPrice(each.getDaysRented());
        }
        System.out.println("Amount owed is  :::   $" + bill + "\n");
        return bill;
    }

    public int getPoints() {
        int frequentRenterPoints = 0;
        Enumeration rentalsE = rentals.elements();
        while (rentalsE.hasMoreElements()) {
            Rental each = (Rental) rentalsE.nextElement();
            frequentRenterPoints += each.getMovie().getPoints(each.getDaysRented());
        }
        System.out.println("You earned :::   " + frequentRenterPoints + " frequent renter points \n");
        return frequentRenterPoints;
    }
}
