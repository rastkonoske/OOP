package finalTask;

import java.util.Calendar;

public class Motorcycle extends Vehicle{

    public Motorcycle() {
        super();
    }

    @Override
    double calculateRegistration() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int yearsOld = currentYear-getProductionYear();
        amountRegistration = 5000;
        if (getEngineSize()<50 && yearsOld>1) {
            amountRegistration = 1000;
        }
        return amountRegistration;
    }

    @Override
    void vehicleReport() {
        System.out.println("Motorcycle: " + getCarBrand() + " " + getCarModel());
        System.out.println("engine size: " + getEngineSize() + "cc");
        System.out.println("horse powers: " + getHorsePowers());
        System.out.println("engine type: " + getEngineType());
        System.out.println("AMOUNT FOR REGISTRATION: " + getAmountRegistration());
        System.out.println("---------------------------------------------------------------");
    }
}
