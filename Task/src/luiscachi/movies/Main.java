package luiscachi.movies;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new NewReleaseMovie("The Revenant"), 2));
        customer.addRental(new Rental(new RegulaMovie("Terminator"),2));
        System.out.println(customer.statement());
    }
}
