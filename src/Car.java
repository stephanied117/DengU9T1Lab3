public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;

    public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
        super(licensePlate, tollFee, passengers);
        this.electric = electric;
        discountApplied = false;   // default value
    }

    public boolean isElectric() {
        return electric;
    }

    public boolean isDiscountApplied() {
        return discountApplied;
    }
    public boolean dropOffPassengers(int numOut) {
        if (numOut >= getPassengers()) {
            return false;
        }
        setPassengers(getPassengers() - numOut);
        return true;
    }
    public void applyDiscount() {
        if (discountApplied == false && electric == true) {
            double discount = getTollFee() / 2.0;
            setTollFee(discount);
            discountApplied = true;
        }
    }

    public void printCar() {
        System.out.println("License Plate: " + getLicensePlate() + "\nToll Fee: " + getTollFee() + "\nPassengers: " + getPassengers() + "\nIs Electric: " + electric);
    }
}
