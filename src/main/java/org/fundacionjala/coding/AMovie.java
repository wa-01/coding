package org.fundacionjala.coding;

public abstract class AMovie {
    private String title;

    public AMovie(final String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract double getAmount(int daysRented);

    public abstract int getFrequentRenterPoints(int daysRented);
}
