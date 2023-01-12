package finalTask;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        System.out.println("Welcome to vehicle registration program");
        System.out.println("If you want to insert vehicle for report, please press 'y', then 'Enter'. If you want to generate report press any other button, then 'Enter'");
        String a = scan.next();
        while (a == "y") {
            System.out.println("Please, choose the type of the vehicle. Press 1 for car, press 2 for motorcycle, press 3 for truck");
            switch (scan.nextInt()) {
                case 1:
                    Car car = new Car();
                    vehicles.add(car);
                    break;
                case 2:
                    Motorcycle motor = new Motorcycle();
                    vehicles.add(motor);
                    break;
                case 3:
                    Truck truck = new Truck();
                    vehicles.add(truck);
                    break;
                default:
                    System.out.println("Please enter the correct number for choosing vehicle type.");
            }
            System.out.println("If you want to insert vehicle for report, please press 'y', then 'Enter'. If you want to generate report press any other button, then 'Enter'");
            a = scan.next();
        }
        fullReport(vehicles);
    }


    public static void fullReport (ArrayList vehicles) {
        int i=1;
        double totalAmount=0;
        System.out.println("All vehicles:");
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle " + i++);
            vehicle.calculateRegistration();
            vehicle.vehicleReport();
        }
        for (Vehicle vehicle : vehicles) {
            totalAmount += vehicle.getAmountRegistration();
        }
        System.out.println("Amount for registration for " + vehicles.size() + " vehicles is: " + totalAmount);
    }
}
