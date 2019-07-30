package org.fundacionjala.coding.mfuentes;

public interface Price {

    int getPriceCode();

    double amount(int daysRented);

    default int renterPoints(int daysRented) {
        return 1;
    }
}
