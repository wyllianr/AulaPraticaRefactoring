import java.util.Enumeration;

public class HtmlStatement extends Statement {

    @Override
    protected String header(Customer customer) {
        return "<H1>Rentals for <EM>" + customer.getName() + "</EM></H1><P>\n";
    }

    @Override
    protected String body(Customer customer) {
        Enumeration rentals = customer.getRentals();
        String result = "";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getMovie().getTitle() + ": " + String.valueOf(each.getCharge()) + "<BR>\n";
        }
        return result;
    }

    @Override
    protected String footer(Customer customer) {
        return "<P>You owe <EM>" + String.valueOf(customer.getTotalCharge()) + "</EM><P>\n" +
               "On this rental you earned <EM>" + String.valueOf(customer.getTotalFrequentRenterPoints()) + "</EM> frequent renter points<P>";
    }
}
