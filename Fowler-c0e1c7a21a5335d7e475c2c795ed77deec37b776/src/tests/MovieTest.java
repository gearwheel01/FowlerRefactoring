package tests;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import classes.Movie;

public class MovieTest {

    private Movie movie;

    @Before
    public void createTestData()
    {
        movie = new Movie("Blockbuster",12);
    }

    @Test
    public void testPriceCode()
    {
        assertEquals(movie.getPriceCode(), 12);
        movie.setPriceCode(13);
        assertEquals(movie.getPriceCode(), 13);
    }

    @Test
    public void testTitle()
    {
        assertEquals(movie.getTitle(),"Blockbuster");
    }
}
