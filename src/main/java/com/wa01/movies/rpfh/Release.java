package com.wa01.movies.rpfh;

public class Release extends Movie {

    public Release(String title) {
        super(title);
    }

    @Override
    public int getPoints(int daysRented) {
        return 1;
    }

    @Override
    public double getPrice(int daysRented) {
        double priceFactor = 3;
        double bill = daysRented * priceFactor;
        System.out.println("Release movie > " + super.getTitle() + "   $" + bill);
        return bill;
    }
}
