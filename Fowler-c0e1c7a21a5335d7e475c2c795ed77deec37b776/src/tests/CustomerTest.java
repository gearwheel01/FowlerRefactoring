package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import Customer;

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
}
