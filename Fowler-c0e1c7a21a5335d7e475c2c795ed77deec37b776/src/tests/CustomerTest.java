package tests;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import classes.Customer;

public class CustomerTest {

    private Customer[] customers;

    @Before
    public void createTestData()
    {
        customers = new Customer[2];
        customers[0] = new Customer("Max");
        customers[1] = new Customer("Maria");
    }

    @Test
    public void testName()
    {
        assertEquals(customers[0].getName(), "Max");
        assertEquals(customers[1].getName(), "Maria");
    }

    @Test
    public void testStatement()
    {
        assertTrue(customers[0].statement().startsWith("Rental Record for Max"));
        assertTrue(customers[1].statement().endsWith("frequent renter points"));
    }
}
