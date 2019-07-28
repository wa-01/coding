package com.wa01.movies.rpfh;

public class Regular extends Movie {

    public Regular(String title) {
        super(title);
    }

    @Override
    public int getPoints(int daysRented) {
        return 0;
    }

    @Override
    public double getPrice(int daysRented) {
        double priceFactor = 1.5;
        double bill = 2;
        if (daysRented > 2) {
            bill += (daysRented - 2) * priceFactor;
        }
        System.out.println("Regular movie > " + super.getTitle() + "   $" + bill);
        return bill;
    }
}
