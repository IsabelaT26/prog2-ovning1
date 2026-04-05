package se.su.ovning1;

public class Book extends Item implements PriceableWithVAT6 {

    private final String author;
    private final double price;
    private final boolean bound;


    public Book(String name, String author, double price, boolean bound){
        super(name);
        this.author = author;
        this.price = price;
        this.bound = bound;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getVAT() {
        return 0;
    }

    @Override
    public double getPriceWithVAT() {
        return 0;
    }
}
