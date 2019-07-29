package org.fundacionjala.coding.mfuentes;

public abstract class Price {

    private int daysRented;

    abstract int getPriceCode();

    abstract public double amount(int daysRented);

    public int renterPoints(int daysRented) {
        this.daysRented = daysRented;
        return 1;
    }
}
