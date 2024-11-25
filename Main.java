public class Main {
    public static void main(String[] args) {

       
        Customer customer = new Customer("GABREIL");

       
        Movie movie1 = new Movie("NEMO", Movie.REGULAR);
        Rental rental1 = new Rental(movie1, 3);
        customer.addRental(rental1);

        Movie movie2 = new Movie("WOLVERINE", Movie.CHILDRENS);
        Rental rental2 = new Rental(movie2, 5);
        customer.addRental(rental2);

        Movie movie3 = new Movie("DRACULA", Movie.NEW_RELEASE);
        Rental rental3 = new Rental(movie3, 2);
        customer.addRental(rental3);

        
        System.out.println("Statement (Text format):");
        System.out.println(customer.statement());

        
        System.out.println("\nStatement (HTML format):");
        System.out.println(customer.htmlStatement());
    }
}
