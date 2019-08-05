package org.fundacionjala.coding.rmendoza;

abstract class Movie {

    abstract double getAmountOwed(int daysRented);
    abstract int getFrequentRenterPoints();

    private final String movieTitle;

    Movie(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    String getMovieTitle() {
        return movieTitle;
    }
}
