package finalTask;

import java.util.Scanner;

abstract class Vehicle {

    Scanner scan = new Scanner(System.in);
    private String carBrand;
    private int engineSize;
    private int horsePowers;
    private String engineType;
    public double amountRegistration;
    private int yearsOld;

    public Vehicle (String carBrand, int engineSize, int horsePowers, String engineType, int yearsOld) {
        System.out.println("Please, type the vehicle Brand or Model");
        carBrand = scan.next();
        this.carBrand = carBrand;

        System.out.println("Please, type the size of the engine");
        engineSize = scan.nextInt();
        this.engineSize = engineSize;

        System.out.println("Please, type the horse powers of the engine");
        horsePowers = scan.nextInt();
        this.horsePowers = horsePowers;

        System.out.println("Please, type the type of the engine (enter 'electric', 'diesel' or 'gasoline')");
        engineType = scan.next();

        while (!engineType.equals("electric") && !engineType.equals("diesel") && !engineType.equals("gasoline")) {
            System.out.println("Please, enter the valid type of engine - 'electric', 'diesel' or 'gasoline'");
            engineType = scan.next();
        }
        this.engineType = engineType;

        System.out.println("Please, type the number of years passed since vehicle production");
        yearsOld = scan.nextInt();
        this.yearsOld = yearsOld;
    }

    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public int getHorsePowers() {
        return horsePowers;
    }

    public void setHorsePowers(int horsePowers) {
        this.horsePowers = horsePowers;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public double getAmountRegistration() {
        return amountRegistration;
    }

    public void setAmountRegistration(double amountRegistration) {
        this.amountRegistration = amountRegistration;
    }

    abstract double calculateRegistration();
    abstract void vehicleReport();

}
