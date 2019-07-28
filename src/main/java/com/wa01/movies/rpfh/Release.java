package com.wa01.movies.rpfh;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Release extends Movie {
    public static final double PRICE_FACTOR = 3.0;
    private static final Logger logger = Logger.getLogger("com.wa01.movies.rpfh.Release");

    public Release(String title) {
        super(title);
    }

    @Override
    public int getPoints(int daysRented) {
        return 1;
    }

    @Override
    public double getPrice(int daysRented) {
        double bill = daysRented * PRICE_FACTOR;
        String message = super.getTitle() + "   $" + bill;
        logger.log(Level.INFO, ()-> "Release movie > " + message);
        return bill;
    }
}
