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
}