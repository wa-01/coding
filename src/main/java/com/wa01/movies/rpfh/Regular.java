package com.wa01.movies.rpfh;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Regular extends Movie {

    public static final double priceFactor = 1.5;
    private final static Logger logger = Logger.getLogger("com.wa01.movies.rpfh.Regular");

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
            bill += (daysRented - 2) * priceFactor;
        }
        logger.log(Level.INFO,"Regular movie > " + super.getTitle() + "   $" + bill);
        return bill;
    }
}
