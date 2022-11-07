package tastatura;

import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {
        float a;

        //Da bi se upisivalo sa tastature potrebno je napraviti Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Molim vas unesite prvi decimalni broj: ");
        // sad dodeljujemo vrednostz a sa tastature
        a = scanner.nextFloat();
        //sad tako isto za b...

        float b=8;
        float c=(a+b)/2;
        System.out.println(c);

    }

}
