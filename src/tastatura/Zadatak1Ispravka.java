package tastatura;

import java.util.Scanner;

public class Zadatak1Ispravka {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Molimo unesite prvi broj a");
        float a = scanner.nextFloat();
        System.out.println("Molimo unesite drugi broj b");
        float b = scanner.nextFloat();
        float c = (a+b)/2;
        System.out.println("Srednja vrednost a i b je " + c);

    }
}
