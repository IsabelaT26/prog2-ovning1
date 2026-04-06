package se.su.ovning1;

public class Book extends Item implements PriceableWithVAT6 {

    private final String author;
    private final double price;
    private final boolean bound;
    private static final double BOUND_PRICE_INCREASE  = 1.3;


    public Book(String name, String author, double price, boolean bound){
        super(name);
        this.author = author;
        this.price = price;
        this.bound = bound;
    }

    @Override
    public double getPrice() {
        return (bound) ? price*BOUND_PRICE_INCREASE : price;
    }

    @Override
    public String toString() {
        return String.format(
                "| %-6s | %-20s |\n" +
                        "| %-6s | %-20s |\n" +
                        "| %-6s | %-20s |\n" +
                        "| %-6s | %-20s |\n" +
                        "| %-6s | %-20s |\n" +
                        "| %-6s | %-20s |",
                "Type", "Book",
                "Title", super.getName(),
                "Author", author,
                "Bound", bound,
                "Price", getPrice(),
                "Price with VAT", getPriceWithVAT()
        );
    }
}
