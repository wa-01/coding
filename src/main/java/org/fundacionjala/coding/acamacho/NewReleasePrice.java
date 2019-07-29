package org.fundacionjala.coding.acamacho;

public class NewReleasePrice implements IPrice {
    private final static double INTEREST = 3;

    @Override
    public double amount(int daysRented) {
        return daysRented * INTEREST;
    }
}
