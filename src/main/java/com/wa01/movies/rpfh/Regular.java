package com.wa01.movies.rpfh;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Regular extends Movie {

    public static final double PRICE_FACTOR = 1.5;
    public static final double PRICE = 2;
    public static final int DAYS = 2;
    private static final Logger LOGGER = Logger.getLogger("com.wa01.movies.rpfh.Regular");

    public Regular(final String title) {
        super(title);
    }

    @Override
    public int getPoints(int daysRented) {
        return 0;
    }

    @Override
    public double getPrice(int daysRented) {
        double bill = PRICE;
        if (daysRented > DAYS) {
            bill += (daysRented - DAYS) * PRICE_FACTOR;
        }
        String message = super.getTitle() + "   $" + bill;
        LOGGER.log(Level.INFO, () -> "Regular movie > " + message);
        return bill;
    }
}
