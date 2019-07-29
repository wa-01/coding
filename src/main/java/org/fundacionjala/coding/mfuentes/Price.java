package org.fundacionjala.coding.mfuentes;

public abstract class Price {
    private int priceCode;
    Price(int priceCode) {
        this.priceCode = priceCode;
    }

//    public int priceCode () {
//        return priceCode;
//    }

    abstract public double amount ( int daysRented );

    public int renterPoints ( int daysRented ){
        return 1;
    }
}
