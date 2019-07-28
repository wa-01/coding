package com.wa01.movies.rpfh;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Children extends Movie {
    public static final double priceFactor = 1.5;
    private final static Logger logger = Logger.getLogger("com.wa01.movies.rpfh.Children");

    public Children(String title) {
        super(title);
    }

    @Override
    public double getPrice(int daysRented) {
        double bill = 1.5;
        if (daysRented > 3) {
            bill += (daysRented - 3) * priceFactor;
        }
        logger.log(Level.INFO,"Children movie > " + super.getTitle() + "   $" + bill);
        return bill;
    }

    @Override
    public int getPoints(int daysRented) {
        return 0;
    }
}
