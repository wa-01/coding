package org.fundacionjala.coding.rmendoza;

class Main {

    public static void main(final String[] args) {
        Statement statement = new Statement("Test");
        statement.addRental(new Rental(new MovieNewRelease("The Revenant"), 2));
        statement.addRental(new Rental(new MovieRegular("Terminator"), 3));
        System.out.println(statement.statement());
    }
}
