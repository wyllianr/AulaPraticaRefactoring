public class Main {
    public static void main(String[] args) {
      
        Movie movie1 = new Movie("NEMO", Movie.CHILDRENS);
        Movie movie2 = new Movie("Wolverine", Movie.REGULAR);

        
        movie1.setPriceCode(Movie.CHILDRENS);
        movie2.setPriceCode(Movie.REGULAR);

       
        System.out.println("Charge for " + movie1.getTitle() + ": " + movie1.getCharge(4)); 
        System.out.println("Charge for " + movie2.getTitle() + ": " + movie2.getCharge(3)); 
    }
}
