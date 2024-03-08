public class Taxi extends Car {
    private double fareCollected;
    private boolean discountApplied;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected) {
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
        discountApplied = false;   // default value
    }

    public void pickupRiders(int numRiders, double farePerRider) {
        if (numRiders >= 4) {
            setPassengers(numRiders + getPassengers());
        }

    }
    public boolean isDiscountApplied() {
        return discountApplied;
    }

    public void printTaxi() {
        System.out.println("License Plate: " + getLicensePlate() + "\nToll Fee: " + getTollFee() + "\nPassengers: " + getPassengers() + "\nIs Electric: " + isElectric() + "\nDiscount Applied: " + isDiscountApplied() + "Fare Collected: " + fareCollected);
    }
}
