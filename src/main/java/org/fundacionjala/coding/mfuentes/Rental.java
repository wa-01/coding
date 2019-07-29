package org.fundacionjala.coding.mfuentes;

public class Rental {
    private Movie _movie;
    private int _daysRented;
    private Price _price;

    public Rental ( Movie movie, int daysRented ) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented () {
        return _daysRented;
    }

    public Movie getMovie () {
        return _movie;
    }

    public double amount () {
        return getMovie().amount(getDaysRented());
    }

    public int renterPoints ( int daysRented ) {

        return getMovie().renterPoints(daysRented);
    }
}
