package org.fundacionjala.coding.mfuentes;

public class ChildrenPrice extends Price{
    public ChildrenPrice(){
        super(Movie.CHILDREN);
    }

    public double amount ( int daysRented ){
        double thisAmount = 1.5;
        if (daysRented > 3)
            thisAmount += (daysRented - 3) * 1.5;
        return thisAmount;
    }
}
