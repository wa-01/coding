package org.fundacionjala.coding;

public abstract class Price {

    private int priceCode;

    public Price(int priceCode) {
        this.priceCode = priceCode;
    }

    public int getPriceCode() {
        return priceCode;
    }

    abstract double getAmount(int daysRented);

    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
