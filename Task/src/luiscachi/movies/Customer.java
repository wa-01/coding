package luiscachi.movies;

import java.util.ArrayList;

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
            totalAmount += rental.getAmount();
            res += "\t" +rental.toString() + "\t\n";
        }
        res += "Amount owned is " + totalAmount +"\n"+"Your earned "
                +frequentRenterPoints +" frequest renter point";
        return res;
    }
}
