package se.su.ovning1;

public class LongPlay extends Recording{

    private static final int CURRENT_YEAR = 2026;

    public LongPlay(String name, String artist, int year, int condition, double price){
        super(name, artist, year, condition, price);
    }

    @Override
    public String getType() {
        return "LP";
    }

    @Override
    public double getPrice(){
        return super.getPrice() + ((CURRENT_YEAR-getYear()) * 5.0);
    }
}
