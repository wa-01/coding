package org.fundacionjala.coding.rmendoza;

public class Movie {

    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int CHILDRENS = 2;

    private String movieTitle;
    private int moviePriceCode;

    public Movie(String title, int priceCode) {
        this.movieTitle = title;
        this.moviePriceCode = priceCode;
    }

    public int getMoviePriceCode() {
        return moviePriceCode;
    }

    public void setMoviePriceCode(int priceCode) {
        moviePriceCode = priceCode;
    }

    public String getMovieTitle() {
        return movieTitle;
    }
}
