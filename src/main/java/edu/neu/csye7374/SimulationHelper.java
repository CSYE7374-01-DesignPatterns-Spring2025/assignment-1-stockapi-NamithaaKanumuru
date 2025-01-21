package edu.neu.csye7374;

public class SimulationHelper {

    public static void runSimulation() {
        // Create instances of GrowthStock and ValueStock
        GrowthStock growthStock = new GrowthStock("GOOG", 1000.00, "Google Growth Stock");
        ValueStock valueStock = new ValueStock("AAPL", 150.00, "Apple Value Stock");

        // Simulate 6 bids for GrowthStock
        System.out.println("Simulating Growth Stock:");
        simulateBids(growthStock, new String[]{"20", "30", "-10", "15", "25", "-5"});

        // Simulate 6 bids for ValueStock
        System.out.println("\nSimulating Value Stock:");
        simulateBids(valueStock, new String[]{"5", "10", "-2", "7", "3", "-1"});
    }

    // Helper method to simulate bids and print stock data
    private static void simulateBids(Stock stock, String[] bids) {
        for (String bid : bids) {
            stock.setBid(bid);
            System.out.println("Price: " + stock.price + ", Metric: " + stock.getMetric());
        }
    }
}
