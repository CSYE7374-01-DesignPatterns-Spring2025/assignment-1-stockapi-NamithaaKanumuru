package edu.neu.csye7374;

public class GrowthStock extends Stock {
    private double growthFactor;

    public GrowthStock(String ID, double price, String description) {
        super(ID, price, description);
        this.growthFactor = 1.5; // Example factor for growth stocks
    }

    @Override
    public int getMetric() {
        return (int) ((price - initialPrice) * growthFactor);
    }
}
