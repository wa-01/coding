package org.fundacionjala.coding.mmendieta;

abstract class Movie {
    private final String title;

    Movie(final String title) {
        this.title = title;
    }

    String getTitle() {
        return title;
    }

    abstract double getAmountOwed(int daysRented);

    abstract int getFrequentRenterPoints();
}
