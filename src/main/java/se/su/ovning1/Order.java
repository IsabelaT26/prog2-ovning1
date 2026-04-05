package se.su.ovning1;

import java.util.Random;

public class Order {

    private final long orderNumber;
    private static long counter;
    private Item[] items;

    public Order(Item... items){
        this.items = items;
        Random rand = new Random();
        orderNumber = Math.abs(rand.nextLong());
        counter = counter + 1;
    }

    public String getReceipt() {
        return "";
    }

    public double getTotalValuePlusVAT(){
        return 0.0;
    }

    public double getTotalValue(){
        return 0.0;
    }
}
