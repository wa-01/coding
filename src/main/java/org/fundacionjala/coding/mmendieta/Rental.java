package org.fundacionjala.coding.mmendieta;

class Rental {
    private final Movie movie;
    private final int daysRented;

    Rental(final Movie movie, final int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    int getDaysRented() {
        return daysRented;
    }

    Movie getMovie() {
        return movie;
    }
}
