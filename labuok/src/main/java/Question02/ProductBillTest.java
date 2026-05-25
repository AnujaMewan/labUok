package Question02;

public class ProductBillTest {
    public static void main(String[] args) {
        ProductBill bill = new ProductBill("1500.00", "two");

        try {
            bill.calculateTotal();
        } catch (NumberFormatException e) {
            System.out.println("Error: Price and quantity must be valid numbers.");
        } finally {
            System.out.println("Product bill calculation completed.");
        }
        System.out.println("Program continues...");
    }
}

//because the string "two" cannot be parsed as an integer