package javaTest;

import java.util.Scanner;

public class Zadatak2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Molim vas unesite distancu u kilometrima");
        double km = scan.nextInt();
        System.out.println("Molim vas unesite tip vozila - Motor, Automobil ili Kombi (vodite racuna o velikim slovima!!!)");
        String vozilo = scan.next();

        switch (vozilo) {
            case "Motor":
            System.out.println(vozilo + " na " + km + " potrosi " + km/100*5 + " litara goriva");
            break;
            case "Automobil":
                System.out.println(vozilo + " na " + km + " potrosi " + km/100*7 + " litara goriva");
                break;
            case "Kombi":
                System.out.println(vozilo + " na " + km + " potrosi " + km/100*15 + " litara goriva");
                break;
            default:
                System.out.println("Uneli ste pogresan tip vozila");
        }
    }
}
