package classes.price;

import classes.Movie;

public class NewReleasePrice extends Price {

    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    public double getCharge(int days)
    {
        return days * 3;
    }

    @Override
    public int getFrequentRenterPoints(int days)
    {
        // add bonus for a two day new release rental
        if (days > 1)
            return 2;
        return 1;
    }
}