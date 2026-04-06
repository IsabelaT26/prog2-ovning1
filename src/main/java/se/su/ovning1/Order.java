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
        StringBuilder sb = new StringBuilder();

        sb.append("Items:\n");

        for (Item item : items) {
            sb.append(item).append("\n"); // no need for toString()
        }

        sb.append("Price: ").append(getTotalValue()).append("\n");
        sb.append("Price with VAT: ").append(getTotalValuePlusVAT());

        return sb.toString(); // cleaner than String.valueOf
    }

    public double getTotalValuePlusVAT(){
        double totalValueWithVAT = 0.0;
        for (Item item: items){
            totalValueWithVAT+=item.getPriceWithVAT();
        }
        return totalValueWithVAT;
    }

    public double getTotalValue(){
        double totalValue = 0.0;
        for (Item item: items){
            totalValue +=item.getPrice();
        }
        return totalValue;
    }
}
