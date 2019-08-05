package org.fundacionjala.coding.rmendoza;

final class Main {

    private Main() {
        //not called
    }

    static void main(final String[] args) {

        int movieDaysRented = 2;

        Statement statement = new Statement("Test");
        statement.addRental(new Rental(new MovieNewRelease("The Revenant"), movieDaysRented));
        statement.addRental(new Rental(new MovieRegular("Terminator"), movieDaysRented));
        System.out.println(statement.statement());
    }
}
