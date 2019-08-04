package org.fundacionjala.coding.jose.colina;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name;
    private Vector _rentals = new Vector();
    private MessagesSender messagesSender = new MessagesSender();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    public void statement() {
        double thisAmount;
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        messagesSender.showCustomerNameStatement(getName());
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //determine amounts for each line
            thisAmount = each.getMovie().getAmount(each.getDaysRented());
            // add frequent renter points
            // add bonus for a two day new release rental
            frequentRenterPoints += each.getMovie().getFrequentRenterPoints(each.getDaysRented());
            //show figures for this rental
            messagesSender.showRental(each.getMovie().getTitle(), thisAmount);
            totalAmount += thisAmount;
        }
        //add footer lines
        messagesSender.showAmountOwned(totalAmount);
        messagesSender.showFrequentPointsEarned(frequentRenterPoints);
    }
}