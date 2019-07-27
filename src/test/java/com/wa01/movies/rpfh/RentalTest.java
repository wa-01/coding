package com.wa01.movies.rpfh;

import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertTrue;

public class RentalTest {
    Customer customer;

    @Before
    public void setUp(){
        customer = new Customer("Tester");
        customer.addRental(new Rental(new Release("The Revenant"), 2));
        customer.addRental(new Rental(new Regular("Terminator"), 2));

        //System.out.println("Amount owed is  :::   $"+ customer.getBill());
        //System.out.println("You earned :::   "+ customer.getPoints()+ " frequent renter points");

    }

    @Test
    public void confirmCustomer(){
        String result = "Rental Record for " + customer.getName() + "\n";
        assertTrue("Andy".contains(result));

    }
    @Test
    public void confirmRent(){
        int result = customer.getPoints();
        assertTrue(result>0);
    }
    @Test
    public void confirm(){
        int result = customer.getPoints();
        assertTrue(result>0);
    }


}
