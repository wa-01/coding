package com.wa01.movies.rpfh;

public class Children extends Movie {
    private String title;
    private int PRICE_TYPE =2;
    private double PRICE_FACTOR = 1.5;

    public Children(String title) {
        super(title);
    }

    @Override
    public double getPrice(int daysRented) {
        double ownning=1.5;
        if (daysRented > 3)
            ownning+= (daysRented - 3) * PRICE_FACTOR;
        System.out.println("Regular movie > " + super.getTitle() + "   $"+ ownning);
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
