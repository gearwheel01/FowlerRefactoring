package classes.price;

import classes.Movie;

public class RegularPrice extends Price {

    public int getPriceCode() {
        return Movie.REGULAR;
    }

    @Override
    public double getCharge(int days)
    {
        double result = 2;
        if (days > 2)
            result += (days - 2) * 1.5;
        return result;
    }

}