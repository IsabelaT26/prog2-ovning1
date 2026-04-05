package se.su.ovning1;

public interface Priceable {
    public abstract double getPrice();
    public abstract double getVAT();
    public double getPriceWithVAT();
}
