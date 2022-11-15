package petlje;

import java.util.Scanner;

public class While {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Molimo unesite broj");
        int x = scanner.nextInt();

        while (x > 0) {
            System.out.println("Molimo unesite broj");
            x = scanner.nextInt();
        }
    }
}
