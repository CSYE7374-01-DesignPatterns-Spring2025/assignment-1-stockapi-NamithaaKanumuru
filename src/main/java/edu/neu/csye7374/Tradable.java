package edu.neu.csye7374;

public interface Tradable {
    /**
     * Place a bid to buy a stock.
     *
     * @param bid
     */
    void setBid(String bid);

    /**
     * Return a metric indicating the measure of positive performance of this stock.
     * A large positive index means consider buying this well-performing stock.
     * A large negative index means consider selling this poorly performing stock.
     *
     * @return
     */
    int getMetric();
}
