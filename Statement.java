import java.util.Enumeration;

public abstract class Statement {

    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = header(aCustomer);
        
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += eachRentalDetails(each);  
        }

        result += footer(aCustomer); 
        return result;
    }

   
    protected abstract String header(Customer aCustomer);

    
    protected abstract String eachRentalDetails(Rental each);

    
    protected abstract String footer(Customer aCustomer);
}
