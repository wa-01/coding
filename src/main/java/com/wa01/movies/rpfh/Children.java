package com.wa01.movies.rpfh;

public class Children extends Movie {

    public Children(String title) {
        super(title);
    }

    @Override
    public double getPrice(int daysRented) {
        double priceFactor = 1.5;
        double bill = 1.5;
        if (daysRented > 3) {
            bill += (daysRented - 3) * priceFactor;
        }
        System.out.println("Children movie > " + super.getTitle() + "   $" + bill);
        return bill;
    }

    @Override
    public int getPoints(int daysRented) {
        return 0;
    }
}
