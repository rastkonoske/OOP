package petlje;

import java.util.Arrays;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x;
        int[] brojevi =new int[4];

        do {
            System.out.println("Molimo unesite cetiri broja");
            for (int i=0; i <brojevi.length;i++){
            brojevi [i] = scanner.nextInt();}
            System.out.println("Molimo unesite broj 0 da zaustavite program ili broj 1 da nastavite sa njim");
            x = scanner.nextInt();
        } while (x != 0);

        System.out.println(Arrays.toString(brojevi));

    }
}
