package org.fundacionjala.coding.jose.colina;

public class MessagesSender {
    public void showCustomerNameStatement(String customerName) {
        System.out.println("Rental Record for " + customerName);
    }

    public void showAmountOwned(double totalAmount) {
        System.out.println("Amount owed is " + totalAmount);
    }

    public void showFrequentPointsEarned(int frequentRenterPoints) {
        System.out.println("You earned " + frequentRenterPoints
                + " frequent renter points");
    }

    public void showRental(String title, double amount) {
        System.out.println("\t" + title + "\t" + amount);
    }
}
