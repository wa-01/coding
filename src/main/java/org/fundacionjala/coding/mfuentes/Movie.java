package org.fundacionjala.coding.mfuentes;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String _title;
    private int _priceCode;
    private Price _price;


    public Movie ( String title, Price price ) {
        _title = title;
        _price = price;
    }

    public int getPriceCode () {
        return _price.priceCode();
    }

//    public void setPriceCode ( int arg ) {
//        _price = new Price(arg);
//    }

    public String getTitle () {
        return _title;
    }

    public double amount ( int daysRented ) {
        return _price.amount(daysRented);
    }

    public int renterPoints ( int daysRented ) {
        return _price.renterPoints(daysRented);
    }
}
