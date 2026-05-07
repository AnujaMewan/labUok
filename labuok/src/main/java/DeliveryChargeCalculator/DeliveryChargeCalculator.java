package DeliveryChargeCalculator;

class DeliveryChargeCalculator {

    // Base charge only
    double calculateCharge(double baseCharge) {
        return baseCharge;
    }

    // Base charge + distance charge
    double calculateCharge(double baseCharge, double distanceKm) {
        return baseCharge + (distanceKm * 100.0);
    }

    // Base charge + distance + weight charge
    double calculateCharge(double baseCharge, double distanceKm, double weightKg) {
        return baseCharge + (distanceKm * 100.0) + (weightKg * 50.0);
    }

    // Base charge + express delivery charge
    double calculateCharge(double baseCharge, boolean expressDelivery) {
        if (expressDelivery) {
            return baseCharge + 500.0;
        }
        return baseCharge;
    }
}