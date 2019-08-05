package org.fundacionjala.coding.jose.colina;

public abstract class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public abstract double getAmount(int daysRented);

    public abstract int getFrequentRenterPoints(int daysRented);
}
