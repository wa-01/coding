package org.fundacionjala.coding.acamacho;

public class NewReleasePrice implements IPrice {
    @Override
    public double amount(int daysRented) {
        return (double) (daysRented * 3);
    }
}
