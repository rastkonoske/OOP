package finalTask;

public class Main {
    public static void main(String[] args) {

        Car Punto = new Car("", 1,1,"",1,1);
        Motorcycle Suzuki = new Motorcycle("", 1, 1, "", 1);
        Truck FAP = new Truck("", 1, 1, "", 1, 1);
        Vehicle[] array= {Punto, Suzuki, FAP};
        fullReport(array);

    }

    public static void fullReport (Vehicle[] array) {
        int i=1;
        double totalAmount=0;
        System.out.println("All vehicles:");
        for (Vehicle vehicle : array) {
            System.out.println("Vehicle " + i++);
            vehicle.calculateRegistration();
            vehicle.vehicleReport();
        }
        for (Vehicle vehicle : array) {
            totalAmount += vehicle.getAmountRegistration();
        }
        System.out.println("Amount for registration for " + array.length + " vehicles is: " + totalAmount);
    }
}
