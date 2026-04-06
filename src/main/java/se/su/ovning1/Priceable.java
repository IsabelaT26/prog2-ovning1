package se.su.ovning1;

public interface Priceable {
    abstract double getPrice();
    abstract double getVAT();
     default double getPriceWithVAT(){
         return getPrice() * (1+getVAT());
     };
}
