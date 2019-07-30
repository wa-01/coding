package org.fundacionjala.coding.mfuentes;

public class Rental {

    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    int getDaysRented() {
        return daysRented;
    }

    Movie getMovie() {
        return movie;
    }

    double amount() {
        return getMovie().amount(getDaysRented());
    }

    int renterPoints() {

        return getMovie().renterPoints(daysRented);
    }
}