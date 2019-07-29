package org.fundacionjala.coding.mfuentes;

public abstract class Price {
    private int _priceCode;
    public Price ( int priceCode ) {
        _priceCode = priceCode;
    }

    public int priceCode () {
        return _priceCode;
    }

    abstract public double amount ( int daysRented );

    public int renterPoints ( int daysRented ){
        return 1;
    }
}
