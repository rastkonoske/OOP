package ifElse;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Molimo unesite broj x");
        int x = scanner.nextInt();

        if (x % 2 == 0 && x % 3 == 0) {
            System.out.println("Broj je deljiv sa 2 i 3");
        } else if (x % 2 == 0) {
            System.out.println("Broj je deljiv sa 2");
        } else if (x % 3 == 0) {
            System.out.println("Broj je deljiv sa 3");
        } else {
            System.out.println("Broj nije deljiv ni sa 2, ni sa 3");
        }
    }
}
