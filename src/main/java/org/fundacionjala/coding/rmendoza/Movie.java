package org.fundacionjala.coding.rmendoza;

public abstract class Movie {

    abstract double getAmountOwed(int daysRented);
    abstract int getFrequentRenterPoints();

    private String movieTitle;

    public Movie(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieTitle(){
        return movieTitle;
    }
}
