package movies;

import java.util.ArrayList;
import java.util.Enumeration;

class Customer {
    private String _name;
    private ArrayList<Rental> _rentals = new ArrayList<Rental>();
    private int frequentRenterPoints;
    private double totalAmount;

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental rental) {
        _rentals.add(rental);
    }

    public String getName() {
        return _name;
    }

    public String statement(){
        String result = "Rental record for "+ getName() + "\n";
        result += summary();
        return result;
    }

    private String summary() {
        String res = "";
        for (Rental rental: _rentals) {
            frequentRenterPoints += rental.getFrequentPoint();
            totalAmount += rental.totalAmount();
            res += "\t" +rental.toString() + "\t\n";
        }
        res += "Amount owned is " + totalAmount +"\n"+"Your earned "
                +frequentRenterPoints +" frequest renter point";
        return res;
    }

    public String statement2() {
        double totalAmount = 0;
        frequentRenterPoints = 0;
        Enumeration rentals = (Enumeration) _rentals.get(1);
        String result = "Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();
            //determine amounts for each line
            switch (each.getMovie().getPriceCode()) {
                case Movie.REGULAR:
                    thisAmount += 2;
                    if (each.getDaysRented() > 2)
                        thisAmount += (each.getDaysRented() - 2) * 1.5;
                    break;
                case Movie.NEW_RELEASE:
                    thisAmount += each.getDaysRented() * 3;
                    break;
                case Movie.CHILDRENS:
                    thisAmount += 1.5;
                    if (each.getDaysRented() > 3)
                        thisAmount += (each.getDaysRented() - 3) * 1.5;
                    break;
            }
            // add frequent renter points
            frequentRenterPoints++;
            // add bonus for a two day new release rental
            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE)
                    &&
                    each.getDaysRented() > 1) frequentRenterPoints++;
            //show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" +
                    String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }
        //add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) +
                "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints)
                +
                " frequent renter points";
        return result;
    }
}
