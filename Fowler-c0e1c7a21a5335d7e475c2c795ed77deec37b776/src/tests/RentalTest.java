package tests;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import classes.Rental;
import classes.Movie;

public class RentalTest {

    private Rental rental;
    private Movie movie;

    @Before
    public void createTestData()
    {
        movie = new Movie("Blockbuster", 12);
        rental = new Rental(movie, 7);
    }

    @Test
    public void testDaysRented()
    {
        assertEquals(rental.getDaysRented(), 7);
    }

    @Test
    public void testMovie()
    {
        assertEquals(rental.getMovie(), movie);
    }
}
