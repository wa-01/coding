package org.fundacionjala.coding.rmendoza;

public class MovieNewRelease extends Movie {

    private Amount amount;

    public MovieNewRelease(String movieTitle) {
        super(movieTitle);
    }

    @Override
    double getAmountOwed(int daysRented) {
        amount = new Amount();
        return daysRented * amount.NEW_RELEASE_DAILY_CHARGE;
    }

    @Override
    int getFrequentRenterPoints() {
        amount = new Amount();
        return amount.NEW_RELEASE_RENTAL_DAY_BONUS;
    }
}
