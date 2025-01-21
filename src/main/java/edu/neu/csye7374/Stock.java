package edu.neu.csye7374;

public class Stock extends StockAPI implements Tradable {
    protected double initialPrice;

    public Stock(String ID, double price, String description) {
        super(ID, price, description);
        this.initialPrice = price;
    }

    @Override
    public void setBid(String bid) {
        double bidValue = Double.parseDouble(bid);
        this.price += bidValue; // Adjust price based on bid value
    }

    @Override
    public int getMetric() {
        return 0; // Base implementation; subclasses will override
    }
}
