package org.fundacionjala.coding.rmendoza;

public class MovieRegular extends Movie {

    private Amount amount;

    public MovieRegular(final String movieTitle) {
        super(movieTitle);
    }

    @Override
    double getAmountOwed(int daysRented) {
        amount = new Amount();
        double amountOwed = amount.REGULAR_AMOUNT;
        if (daysRented > amount.ALLOWED_REGULAR_RENTAL_DAYS) {
            amountOwed += (daysRented - amount.ALLOWED_REGULAR_RENTAL_DAYS) * amount.REGULAR_DAILY_CHARGE;
        }
        return amountOwed;
    }

    @Override
    int getFrequentRenterPoints() {
        return 1;
    }
}
