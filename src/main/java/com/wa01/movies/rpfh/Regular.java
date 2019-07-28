package com.wa01.movies.rpfh;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Regular extends Movie {

    public static final double PRICE_FACTOR = 1.5;
    private static final Logger logger = Logger.getLogger("com.wa01.movies.rpfh.Regular");

    public Regular(String title) {
        super(title);
    }

    @Override
    public int getPoints(int daysRented) {
        return 0;
    }

    @Override
    public double getPrice(int daysRented) {
        double bill = 2;
        if (daysRented > 2) {
            bill += (daysRented - 2) * PRICE_FACTOR;
        }
        String message = super.getTitle() + "   $" + bill;
        logger.log(Level.INFO, ()-> "Regular movie > " + message);
        return bill;
    }
}
