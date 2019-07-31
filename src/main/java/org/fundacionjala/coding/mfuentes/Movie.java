package org.fundacionjala.coding.mfuentes;

public class Movie {

    static final int CHILDREN = 2;
    static final int REGULAR = 0;
    static final int NEW_RELEASE = 1;
    private String movieTitle;
    private Price price;

    public Movie(final String title, final Price price) {
        movieTitle = title;
        this.price = price;
    }

    public int getPriceCode() {
        return price.getPriceCode();
    }

    String getTitle() {
        return movieTitle;
    }

    double amount(int daysRented) {
        return price.amount(daysRented);
    }

    int renterPoints(int daysRented) {
        return price.renterPoints(daysRented);
    }
}
