import java.util.Enumeration;

public abstract class Statement {
    abstract String getCustomerTitle(Customer aCustomer);

    abstract String getMovieTitle(Rental rental);

    abstract String getRentalDetails(Customer aCustomer);

    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = getCustomerTitle(aCustomer);
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            // show figures for each rental
            result += getMovieTitle(each);
        }
        // add footer lines
        result += getRentalDetails(aCustomer);
        return result;
    }
}