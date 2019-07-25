package org.fundacionjala.coding;

public class Movie {
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int CHILDREN = 2;

    private String title;
    private Price price;

    public Movie(final String title, final Price price) {
        this.title = title;
        this.price = price;
    }

    public int getPriceCode() {
        return price.getPriceCode();
    }

    public String getTitle() {
        return title;
    }

    public double getAmount(int daysRented) {
        return price.getAmount(daysRented);
    }
}
