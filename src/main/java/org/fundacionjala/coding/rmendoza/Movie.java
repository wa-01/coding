package org.fundacionjala.coding.rmendoza;

abstract class Movie {

    abstract double getAmountOwed(int daysRented);
    abstract int getFrequentRenterPoints();

    private final String movieTitle;

    Movie(final String movieTitle) {
        this.movieTitle = movieTitle;
    }

    String getMovieTitle() {
        return movieTitle;
    }
}
