import java.util.Enumeration;

public class TextStatement extends Statement {
    
    @Override
    protected String getHeader(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    @Override
    protected String getBody(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        StringBuilder body = new StringBuilder();
        
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            body.append("\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n");
        }
        
        return body.toString();
    }

    @Override
    protected String getFooter(Customer aCustomer) {
        return "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n" +
               "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + " frequent renter points";
    }
}
