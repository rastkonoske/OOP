package ifElse;

import java.util.Scanner;

public class Zadatak6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Molimo unesite prvi broj x");
        int x = scanner.nextInt();
        System.out.println("Molimo unesite drugi broj y");
        int y = scanner.nextInt();
        System.out.println("Molimo unesite treci broj z");
        int z = scanner.nextInt();

        if (x < y && y < z) {
            System.out.println("Vrednosti su u rastucem redosledu");
        } else if (x>y && y>z) {
            System.out.println("Vrednosti su u opadajucem redosledu");
        } else {
            System.out.println("Redosled nije sortiran");
        }
    }
}
