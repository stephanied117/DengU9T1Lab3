public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;

    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
        super(licensePlate, tollFee, passengers);
        this.axles = axles;
        this.hasTrailer = hasTrailer;
    }

    public int getAxles() {
        return axles;
    }

    public boolean hasTrailer() {
        return hasTrailer;
    }
    public boolean validateLicensePlate() {
        if (axles > 4 && hasTrailer == true) {
            if (getLicensePlate().substring(5).equals("MX")) {
                setTollFee(getTollFee() / 2);
                return true;
            } else {
                setLicensePlate(getLicensePlate().substring(0, 4) + "MX");
            }
        } else if (axles <= 4 && hasTrailer == true) {
            if (getLicensePlate().substring(5).equals("LX")) {
                return true;
            } else {
                setLicensePlate(getLicensePlate().substring(0, 4) + "LX");
            }
        } else if (hasTrailer == false) {
            return true;
        }
        return false;
    }

    public void printTruck() {
        System.out.println("License Plate:" + getLicensePlate() + "\nToll Fee: " + getTollFee() + "\nPassengers: " + getPassengers() + "\nHas Trailer: " + hasTrailer);
    }
}
