package DeliveryChargeCalculator;

public class VehicleRentalTest {

    public static void main(String[] args) {

        Vehicle vehicle1 = new Car("CAR101", "Toyota", 5, 8000.0);

        Vehicle vehicle2 = new Bike("BIKE201", "Honda", 10, 500.0);

        System.out.println("Car Details");
        vehicle1.displayVehicleInfo();
        System.out.println("Rental Cost: " + vehicle1.calculateRentalCost());

        System.out.println();

        System.out.println("Bike Details");
        vehicle2.displayVehicleInfo();
        System.out.println("Rental Cost: " + vehicle2.calculateRentalCost());
    }
}

/*
This is runtime polymorphism because the overridden
method is selected at runtime based on the actual
object type (Car or Bike).
*/