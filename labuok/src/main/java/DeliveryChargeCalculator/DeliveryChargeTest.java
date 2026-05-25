package DeliveryChargeCalculator;

public class DeliveryChargeTest {

    public static void main(String[] args) {

        DeliveryChargeCalculator calculator = new DeliveryChargeCalculator();

        double charge1 = calculator.calculateCharge(1000.0);

        double charge2 = calculator.calculateCharge(1000.0, 5.0);

        double charge3 = calculator.calculateCharge(1000.0, 5.0, 10.0);

        double charge4 = calculator.calculateCharge(1000.0, true);

        System.out.println("Base Charge Only: " + charge1);

        System.out.println("Base + Distance Charge: " + charge2);

        System.out.println("Base + Distance + Weight Charge: " + charge3);

        System.out.println("Base + Express Delivery Charge: " + charge4);
    }
}

/*
This is compile-time polymorphism because Java selects
the correct overloaded method during compilation
based on the parameter list.
*/