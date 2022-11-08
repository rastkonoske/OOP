package ifElse;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Molimo unesite prvi broj x");
        int x = scanner.nextInt();
        if (x % 2 == 0) {
            System.out.println("Broj " + x + " je paran");
        } else {
            System.out.println("Broj " + x + " je neparan");
        }

        System.out.println("Molimo unesite drugi broj y");
        int y = scanner.nextInt();
        if (y % 2 == 0) {
            System.out.println("Broj " + y + " je paran");
        } else {
            System.out.println("Broj " + y + " je neparan");
        }

    }
}
