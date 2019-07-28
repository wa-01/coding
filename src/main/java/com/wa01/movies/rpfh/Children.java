package com.wa01.movies.rpfh;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Children extends Movie {
    public static final double PRICE_FACTOR = 1.5;
    private static final Logger logger = Logger.getLogger("com.wa01.movies.rpfh.Children");

    public Children(String title) {
        super(title);
    }

    @Override
    public double getPrice(int daysRented) {
        double bill = 1.5;
        if (daysRented > 3) {
            bill += (daysRented - 3) * PRICE_FACTOR;
        }
        String message = super.getTitle() + "   $" + bill;
        logger.log(Level.INFO, ()-> "Children movie > " + message);

        return bill;
    }

    @Override
    public int getPoints(int daysRented) {
        return 0;
    }
}
