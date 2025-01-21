package edu.neu.csye7374;

public class ValueStock extends Stock {
    private double stabilityFactor;

    public ValueStock(String ID, double price, String description) {
        super(ID, price, description);
        this.stabilityFactor = 0.75; // Example factor for value stocks
    }

    @Override
    public int getMetric() {
        return (int) ((price - initialPrice) * stabilityFactor);
    }
}

