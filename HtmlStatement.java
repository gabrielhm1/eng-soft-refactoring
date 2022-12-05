public class HtmlStatement extends Statement {
        String getCustomerTitle(Customer aCustomer) {
                return "<H1>Rentals for <EM>" + aCustomer.getName() +
                                "</EM></H1><P>\n";
        }

        String getMovieTitle(Rental rental) {
                return rental.getMovie().getTitle() + ": " +
                                String.valueOf(rental.getCharge()) + "<BR>\n";
        }

        String getRentalDetails(Customer aCustomer) {
                String result = "";
                result += "<P>You owe <EM>" +
                                String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
                result += "On this rental you earned <EM>" +
                                String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
                                "</EM> frequent renter points<P>";
                return result;
        }
}