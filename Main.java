public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Gabriel");

        Movie movie1 = new Movie("NEMO", Movie.CHILDRENS);
        Movie movie2 = new Movie("Wolverine", Movie.REGULAR);
        Movie movie3 = new Movie("Dracula", Movie.NEW_RELEASE);

        Rental rental1 = new Rental(movie1, 3);
        Rental rental2 = new Rental(movie2, 5);
        Rental rental3 = new Rental(movie3, 2);

        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);

        System.out.println("Statement (Text format):\n" + customer.statement());
        System.out.println("\nStatement (HTML format):\n" + customer.htmlStatement());
    }
}
