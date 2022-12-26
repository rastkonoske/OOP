package finalTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of vehicles for your report");
        int numberOfVehicles  = scan.nextInt();
        Vehicle[] array = new Vehicle[numberOfVehicles];
        int j=0;
        while (j<numberOfVehicles) {
            System.out.println("Please, choose the type of the vehicle. Press 1 for car, press 2 for motorcycle, press 3 for truck");
            switch (scan.nextInt()){
                case 1:
                    Car car = new Car();
                    array[j]=car;
                    j++;
                    break;
                case 2:
                    Motorcycle motor = new Motorcycle();
                    array[j]=motor;
                    j++;
                    break;
                case 3:
                    Truck truck = new Truck();
                    array[j]=truck;
                    j++;
                    break;
                default:
                    System.out.println("Please enter the correct number for choosing vehicle type.");
            }
        }

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
