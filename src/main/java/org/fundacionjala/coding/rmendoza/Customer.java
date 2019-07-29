package org.fundacionjala.coding.rmendoza;

import java.util.Enumeration;
import java.util.Vector;

class Customer {

    private Amount amount;

    private String customerName;
    private Vector customerRentals = new Vector();

    public Customer(String name) {
        this.customerName = name;
    }

    public void addRental(Rental rentalValue) {
        customerRentals.addElement(rentalValue);
    }

    public String getCustomerName() {
        return customerName;
    }

    private String setStatement() {
        double totalAmount = 0D;
        int frequentRenterPoints = 0;
        Enumeration rentals = this.customerRentals.elements();
        String result = "Rental Record for " + getCustomerName() + "\n";
        while (rentals.hasMoreElements()) {
            double thisAmount = 0D;
            Rental each = (Rental) rentals.nextElement();
            //determine amounts for each line
            switch (each.getMovie().getMoviePriceCode()) {
                case Movie.REGULAR:
                    thisAmount += amount.REGULAR_AMOUNT;
                    if (each.getDaysRented() > amount.ALLOWED_REGULAR_RENTAL_DAYS)
                        thisAmount += (each.getDaysRented() - amount.ALLOWED_REGULAR_RENTAL_DAYS) * amount.REGULAR_DAILY_CHARGE;
                    break;
                case Movie.NEW_RELEASE:
                    thisAmount += each.getDaysRented() * amount.NEW_RELEASE_DAILY_CHARGE;
                    break;
                case Movie.CHILDRENS:
                    thisAmount += amount.CHILDRENS_AMOUNT;
                    if (each.getDaysRented() > amount.ALLOWED_CHILDRENS_RENTAL_DAYS)
                        thisAmount += (each.getDaysRented() - amount.ALLOWED_CHILDRENS_RENTAL_DAYS) * amount.CHILDREN_DAILY_CHARGE;
                    break;
            }
            // add frequent renter points
            frequentRenterPoints++;

            // add bonus for a two day new release rental
            if ((each.getMovie().getMoviePriceCode() == Movie.NEW_RELEASE)
                    &&
                    each.getDaysRented() >= amount.NEW_RELEASE_RENTAL_DAY_BONUS) frequentRenterPoints++;
            //show figures for this rental
            result += "\t" + each.getMovie().getMovieTitle() + "\t" +
                    String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }
        //add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) +
                "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints)
                +
                " frequent renter points";
        return result;
    }

    private double setTotalStatement() {
        double totalAmount = 0D;
        int frequentRenterPoints = 0;
        Enumeration rentals = this.customerRentals.elements();
        String result = "Rental Record for " + getCustomerName() + "\n";
        while (rentals.hasMoreElements()) {
            double thisAmount = 0D;
            Rental each = (Rental) rentals.nextElement();
            //determine amounts for each line
            switch (each.getMovie().getMoviePriceCode()) {
                case Movie.REGULAR:
                    thisAmount += amount.REGULAR_AMOUNT;
                    if (each.getDaysRented() > amount.ALLOWED_REGULAR_RENTAL_DAYS)
                        thisAmount += (each.getDaysRented() - amount.ALLOWED_REGULAR_RENTAL_DAYS) * amount.REGULAR_DAILY_CHARGE;
                    break;
                case Movie.NEW_RELEASE:
                    thisAmount += each.getDaysRented() * amount.NEW_RELEASE_DAILY_CHARGE;
                    break;
                case Movie.CHILDRENS:
                    thisAmount += amount.CHILDRENS_AMOUNT;
                    if (each.getDaysRented() > amount.ALLOWED_CHILDRENS_RENTAL_DAYS)
                        thisAmount += (each.getDaysRented() - amount.ALLOWED_CHILDRENS_RENTAL_DAYS) * amount.CHILDREN_DAILY_CHARGE;
                    break;
            }
            // add frequent renter points
            frequentRenterPoints++;

            // add bonus for a two day new release rental
            if ((each.getMovie().getMoviePriceCode() == Movie.NEW_RELEASE)
                    &&
                    each.getDaysRented() >= amount.NEW_RELEASE_RENTAL_DAY_BONUS) frequentRenterPoints++;
            //show figures for this rental
            result += "\t" + each.getMovie().getMovieTitle() + "\t" +
                    String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }
        //add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) +
                "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints)
                +
                " frequent renter points";
        //return result;
        return totalAmount;
    }

    public String getStatement() {
        return setStatement();
    }

    public double getTotalStatement() {
        return setTotalStatement();
    }

}
