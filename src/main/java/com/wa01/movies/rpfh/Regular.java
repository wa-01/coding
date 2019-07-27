package com.wa01.movies.rpfh;

public class Regular extends Movie {
    private int PRICE_TYPE = 0;
    private double PRICE_FACTOR = 1.5;

    public Regular(String title) {
        super(title);
    }

    @Override
    public double getPrice(int daysRented) {
        double ownning = 2;
        if (daysRented > 2)
            ownning += (daysRented - 2) * PRICE_FACTOR;
        System.out.println("Regular movie > " + super.getTitle() + "   $" + ownning);
        return ownning;
    }

    @Override
    public int getPoints(int daysRented) {
        return 0;
    }

    public int getPRICE_TYPE() {
        return PRICE_TYPE;
    }

    public double getPRICE_FACTOR() {
        return PRICE_FACTOR;
    }
}
