package org.fundacionjala.coding.jose.colina;

public class newReleaseMovie extends Movie {

    public newReleaseMovie(String title){
        super(title);
    }

    @Override
    public double getAmount(int daysRented) {
        double amount = daysRented * 3;
        return amount;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        if(daysRented > 1)
            return 2;
        else
            return 1;
    }
}
