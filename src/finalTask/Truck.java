package finalTask;

public class Truck extends Vehicle{
    private int trailerNumber;

    public Truck(String carBrand, int engineSize, int horsePowers, String engineType, int yearsOld, int trailerNumber) {
        super(carBrand, engineSize, horsePowers, engineType, yearsOld);
        System.out.println("Please, type the number of trails");
        trailerNumber = scan.nextInt();
        this.trailerNumber = trailerNumber;
    }

    public int getTrailerNumber() {
        return trailerNumber;
    }

    public void setTrailNumber(int trailerNumber) {
        this.trailerNumber = trailerNumber;
    }

    @Override
    double calculateRegistration() {
        amountRegistration = 10000;
        for (int i=1; i<trailerNumber; i++) {
            amountRegistration = amountRegistration + 7000;
        }
        return amountRegistration;
    }

    @Override
    void vehicleReport() {
        System.out.println("Truck: " + getCarBrand());
        System.out.println("engine size: " + getEngineSize() + "cc");
        System.out.println("horse powers: " + getHorsePowers());
        System.out.println("engine type: " + getEngineType());
        System.out.println("number of trailers: " + getTrailerNumber());
        System.out.println("AMOUNT FOR REGISTRATION: " + getAmountRegistration());

    }
}
