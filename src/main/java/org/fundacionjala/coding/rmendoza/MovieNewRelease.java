package org.fundacionjala.coding.rmendoza;

import static org.fundacionjala.coding.rmendoza.Amount.NEW_RELEASE_DAILY_CHARGE;
import static org.fundacionjala.coding.rmendoza.Amount.NEW_RELEASE_RENTAL_DAY_BONUS;

public class MovieNewRelease extends Movie {

    public MovieNewRelease(final String movieTitle) {
        super(movieTitle);
    }

    @Override
    double getAmountOwed(int daysRented) {
        return (double)daysRented * NEW_RELEASE_DAILY_CHARGE;
    }

    @Override
    int getFrequentRenterPoints() {
        return NEW_RELEASE_RENTAL_DAY_BONUS;
    }
}
