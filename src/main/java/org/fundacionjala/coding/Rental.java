package org.fundacionjala.coding;

public class Rental {

    private AMovie aMovie;
    private int daysRented;

    public Rental(final AMovie aMovie, int daysRented) {
        this.aMovie = aMovie;
        this.daysRented = daysRented;
    }

    public String getTitle() {
        return aMovie.getTitle();
    }

    public double getAmount() {
        return aMovie.getAmount(this.daysRented);
    }

    public int getFrequentRenterPoints() {
        return aMovie.getFrequentRenterPoints(this.daysRented);
    }

}
