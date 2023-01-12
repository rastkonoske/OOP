package finalTask;

import java.util.Calendar;

public class Car extends Vehicle{

    private int numberDoors;

    public Car() {
        super();
        System.out.println("Please, type the number of doors");
        numberDoors = scan.nextInt();
        this.numberDoors = numberDoors;

    }

    public int getNumberDoors() {
        return numberDoors;
    }

    public void setNumberDoors(int numberDoors) {
        this.numberDoors = numberDoors;
    }

    @Override
    double calculateRegistration() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int yearsOld = currentYear-getProductionYear();
        if (getEngineType().equals("electric")) {
            amountRegistration=5000;
        } else {amountRegistration =10000;
            if (getEngineSize() >2000) {
                amountRegistration = amountRegistration + 0.4*amountRegistration;
            }}
        for (int i=5; i<yearsOld; i++) {
            amountRegistration = amountRegistration + amountRegistration*0.05;
        }
        return amountRegistration;
    }

    @Override
    void vehicleReport() {
        System.out.println("Car: " + getCarBrand() + " " + getCarModel());
        System.out.println("engine size: " + getEngineSize() + "cc");
        System.out.println("horse powers: " + getHorsePowers());
        System.out.println("engine type: " + getEngineType());
        System.out.println("number of doors: " + getNumberDoors());
        System.out.println("AMOUNT FOR REGISTRATION: " + getAmountRegistration());
        System.out.println("---------------------------------------------------------------");
    }
}
