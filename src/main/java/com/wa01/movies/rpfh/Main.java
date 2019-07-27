package com.wa01.movies.rpfh;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola a todos");
        Customer customer = new Customer("Rosario");
        customer.addRental(new Rental(new Release("The Revenant"), 2));
        customer.addRental(new Rental(new Regular("Terminator"), 2));
        customer.addRental(new Rental(new Children("Toy Story"), 5));
        customer.addRental(new Rental(new Release("Infinity War"), 3));
        String result = "Rental Record for " + customer.getName() + "\n";
        System.out.println("Amount owed is  :::   $" + customer.getBill());
        System.out.println("You earned :::   " + customer.getPoints() + " frequent renter points");
    }
}
