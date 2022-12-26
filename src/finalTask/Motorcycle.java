package finalTask;

public class Motorcycle extends Vehicle{

    public Motorcycle(String carBrand, int engineSize, int horsePowers, String engineType, int yearsOld) {
        super(carBrand, engineSize, horsePowers, engineType, yearsOld);
    }

    @Override
    double calculateRegistration() {
        amountRegistration = 5000;
        if (getEngineSize()<50 && getYearsOld()>1) {
            amountRegistration = 1000;
        }
        return amountRegistration;
    }

    @Override
    void vehicleReport() {
        System.out.println("Motorcycle: " + getCarBrand());
        System.out.println("engine size: " + getEngineSize() + "cc");
        System.out.println("horse powers: " + getHorsePowers());
        System.out.println("engine type: " + getEngineType());
        System.out.println("AMOUNT FOR REGISTRATION: " + getAmountRegistration());
    }
}
