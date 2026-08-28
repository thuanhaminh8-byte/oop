import junit.framework.TestCase;

import static junit.framework.Assert.assertEquals;

public class CoffeeReceipt {
    private String kind;
    private double weight;
    private double pricePerPound;

    public CoffeeReceipt(String kind, double weight, double pricePerPound){
        this.kind = kind;
        this.pricePerPound = pricePerPound;
        this.weight = weight;
    }

    public double sellingCost(){
        return this.pricePerPound * this.weight;
    }

    public boolean weighsMore(double amount) {
        return this.weight > amount;
    }

    public boolean isCheaperThan(CoffeeReceipt that) {
        return this.pricePerPound < that.pricePerPound;
    }

    public boolean costLessThan(CoffeeReceipt that) {
        return this.sellingCost() < that.sellingCost();
    }
}