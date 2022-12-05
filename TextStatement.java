import java.util.Enumeration;

public class TextStatement extends Statement {
        private String getCustomerTitle(Customer aCustomer) {
                return "Rental Record for " + aCustomer.getName() +
                                "\n";
        }

        private String getMovieTitle(Rental rental) {
                return "\t" + rental.getMovie().getTitle() + "\t" +
                                String.valueOf(rental.getCharge()) + "\n";
        }

        private String getRentalDetails(Customer aCustomer) {
                String result = "";
                result += "Amount owed is " +
                                String.valueOf(aCustomer.getTotalCharge()) + "\n";
                result += "You earned " +
                                String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
                                " frequent renter points";
                return result;
        }

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