import java.util.Enumeration;

public class HtmlStatement extends Statement {

    @Override
    protected String getHeader(Customer aCustomer) {
        return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
    }

    @Override
    protected String getBody(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        StringBuilder body = new StringBuilder();
        
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            body.append(each.getMovie().getTitle() + ": " + String.valueOf(each.getCharge()) + "<BR>\n");
        }
        
        return body.toString();
    }

    @Override
    protected String getFooter(Customer aCustomer) {
        return "<P>You owe <EM>" + String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n" +
               "On this rental you earned <EM>" + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + "</EM> frequent renter points<P>";
    }
}
