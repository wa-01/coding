package org.fundacionjala.coding.mfuentes;

public abstract class Price {

    abstract int getPriceCode();

    abstract public double amount(int daysRented);

    public int renterPoints(int daysRented) {

        return 1;
    }
}
