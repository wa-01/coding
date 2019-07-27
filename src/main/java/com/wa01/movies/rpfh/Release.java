package com.wa01.movies.rpfh;

public class Release extends Movie {
    private int PRICE_TYPE = 1;
    private double PRICE_FACTOR = 3;

    public Release(String title) {
        super(title);
    }

    @Override
    public int getPoints(int daysRented) {
        return 1;
    }

    @Override
    public double getPrice(int daysRented) {
        double ownning = daysRented * PRICE_FACTOR;
        System.out.println("Regular movie > " + super.getTitle() + "   $" + ownning);
        return ownning;
    }

    public int getPRICE_TYPE() {
        return PRICE_TYPE;
    }

    public double getPRICE_FACTOR() {
        return PRICE_FACTOR;
    }
}
