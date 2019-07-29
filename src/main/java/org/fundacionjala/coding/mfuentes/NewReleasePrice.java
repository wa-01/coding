package org.fundacionjala.coding.mfuentes;

public class NewReleasePrice extends Price {

    @Override
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }
    @Override
    public double amount(int daysRented) {
        return (double) (daysRented * 3);
    }
    @Override
    public int renterPoints(int daysRented) {
        int day = 1;
        int day1 = 2;
        if (daysRented > day)
            return day1;
        else
            return day;
    }
}
