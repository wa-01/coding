package org.fundacionjala.coding;

public class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(final Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public double getAmount() {
        return getMovie().getAmount(getDaysRented());
    }
}
