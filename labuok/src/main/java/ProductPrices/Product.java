package ProductPrices;

/**
 * OOP Class representing a Product entity[cite: 457].
 * This class stores the data and contains the price calculation logic[cite: 19, 415].
 * * @author Anuja Mewan
 */
public class Product {
    // Private attributes for secure data encapsulation [cite: 459]
    private String productName;
    private double unitPrice;
    private int quantity;

    /**
     * Constructor to initialize the Product object[cite: 460].
     * * @param productName The name of the product
     * @param unitPrice   The cost per individual unit
     * @param quantity    The number of items in stock
     */
    public Product(String productName, double unitPrice, int quantity) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    // Getter methods to access encapsulated data safely [cite: 461]
    public String getProductName() {
        return productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    /**
     * Calculates the total gross price based on unit price and quantity[cite: 462].
     * Keeps user interface layers completely separate from math logic[cite: 19, 411].
     * * @return unitPrice * quantity
     */
    public double calculateTotal() {
        return unitPrice * quantity;
    }

    /**
     * Business logic rule to evaluate warehouse inventory levels[cite: 463].
     * * @return "Low Stock" if quantity is less than 5, otherwise "Available" [cite: 464, 465]
     */
    public String getStockStatus() {
        if (quantity < 5) {
            return "Low Stock"; // Condition met if stock drops under 5 units [cite: 464]
        } else {
            return "Available"; // Normal availability state [cite: 465]
        }
    }
}