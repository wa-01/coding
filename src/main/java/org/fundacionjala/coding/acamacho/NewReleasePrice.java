package org.fundacionjala.coding.acamacho;

public class NewReleasePrice implements IPrice {
    private static final double INTEREST = 3;

    @Override
    public double amount(int daysRented) {
        return daysRented * INTEREST;
    }
}
