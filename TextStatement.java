import java.util.Enumeration;

public class TextStatement extends Statement {

    @Override
    protected String header(Customer customer) {
        return "Rental Record for " + customer.getName() + "\n";
    }

    @Override
    protected String body(Customer customer) {
        Enumeration rentals = customer.getRentals();
        String result = "";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
        }
        return result;
    }

    @Override
    protected String footer(Customer customer) {
        return "Amount owed is " + String.valueOf(customer.getTotalCharge()) + "\n" +
               "You earned " + String.valueOf(customer.getTotalFrequentRenterPoints()) + " frequent renter points";
    }
}
