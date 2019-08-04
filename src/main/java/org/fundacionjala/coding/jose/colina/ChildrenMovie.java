package org.fundacionjala.coding.jose.colina;

public class ChildrenMovie extends Movie {
    private static final int FREQUENT_POINTS = 1;

    public ChildrenMovie(String title){
        super(title);
    }

    @Override
    public double getAmount(int daysRented) {
        double amount = 1.5;
        if (daysRented > 3) {
            amount += (daysRented - 3) * 1.5;
        }
        return amount;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return FREQUENT_POINTS;
    }
}
