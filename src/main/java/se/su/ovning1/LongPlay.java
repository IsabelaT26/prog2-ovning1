package se.su.ovning1;

public class LongPlay extends Recording{

    public LongPlay(String name, String artist, int year, int condition, double price){
        super(name, artist, year, condition, price);
    }

    @Override
    public String getType() {
        return "LP";
    }

    @Override
    public double getVAT() {
        return 0;
    }

    @Override
    public double getPriceWithVAT() {
        return 0;
    }

    @Override
    public double getVat() {
        return 0;
    }
}
