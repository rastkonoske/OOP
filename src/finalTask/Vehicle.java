package finalTask;

import java.util.Scanner;

abstract class Vehicle {

    Scanner scan = new Scanner(System.in);
    private String carBrand;
    private String carModel;
    private int engineSize;
    private int horsePowers;
    private String engineType;
    public double amountRegistration;
    private int productionYear;

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public Vehicle () {
        System.out.println("Please, type the vehicle Brand");
        carBrand = scan.next();
        this.carBrand = carBrand;

        System.out.println("Please, type the vehicle Model");
        carModel = scan.next();
        this.carModel = carModel;

        System.out.println("Please, type the size of the engine in cc. Size MUST be inserted as NUMBER value!");
        engineSize = scan.nextInt();
        this.engineSize = engineSize;

        System.out.println("Please, type the horse powers of the engine. Horse powers MUST be inserted as NUMBER value!");
        horsePowers = scan.nextInt();
        this.horsePowers = horsePowers;

        System.out.println("Please, type the type of the engine (enter 'electric', 'diesel' or 'gasoline')");
        engineType = scan.next();

        while (!engineType.equalsIgnoreCase("electric") && !engineType.equalsIgnoreCase("diesel") && !engineType.equalsIgnoreCase("gasoline")) {
            System.out.println("Please, enter the valid type of engine - 'electric', 'diesel' or 'gasoline'");
            engineType = scan.next();
        }
        this.engineType = engineType;

        System.out.println("Please, type the production year of the vehicle. Production year MUST be inserted as WHOLE NUMBER (without '.' or other characters)!");
        productionYear = scan.nextInt();
        this.productionYear = productionYear;
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

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int yearsOld) {
        this.productionYear = productionYear;
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
