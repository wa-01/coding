package org.fundacionjala.coding.rmendoza;

class Main {

    static void main(final String[] args) {

        int movieNewReleaseDaysRented = 2;
        int movieRegularDaysRented = 3;

        Statement statement = new Statement("Test");
        statement.addRental(new Rental(new MovieNewRelease("The Revenant"), movieNewReleaseDaysRented));
        statement.addRental(new Rental(new MovieRegular("Terminator"), movieRegularDaysRented));
        System.out.println(statement.statement());
    }
}
