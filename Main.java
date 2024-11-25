public class Main {
    public static void main(String[] args) {
       
        Movie movie1 = new Movie("NEMO", Movie.CHILDRENS);
        Movie movie2 = new Movie("Wolverine", Movie.REGULAR);
        Movie movie3 = new Movie("Dracula", Movie.NEW_RELEASE);

       
        Rental rental1 = new Rental(movie1, 3);
        Rental rental2 = new Rental(movie2, 4);
        Rental rental3 = new Rental(movie3, 5);

        Customer customer = new Customer("Gabriel");

        
        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);

        System.out.println("Statement (Text format):");
        System.out.println(customer.statement());

        System.out.println("\nStatement (HTML format):");
        System.out.println(customer.htmlStatement());
    }
}
