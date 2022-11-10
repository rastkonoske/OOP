package operators;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Molimo unesite prvi broj");
        int x = scanner.nextInt();
        System.out.println("Molimo unesite drugi broj");
        int y = scanner.nextInt();
        System.out.println("Molimo unesite racunsku operaciju");
        char operator = scanner.next().charAt(0);
        int rezultat1 = 0;

        switch (operator) {
            case '+' :
                rezultat1 = x + y;
                break;
                case '-':
                rezultat1 = x - y;
                break;
            case '*':
                rezultat1 = x * y;
                break;
            case '/':
                rezultat1 = x/y;
                break;
            case '%':
                rezultat1 = x%y;
            default:
                System.out.println("Unesite ispravnu racunsku operaciju!");
        }

        System.out.println("Rezultat je " + rezultat1);

        System.out.println("Molimo unesite treci broj");
        int z = scanner.nextInt();
        System.out.println("Molimo unesite racunsku operaciju");
        char operator1 = scanner.next().charAt(0);
        int rezultat2 = 0;

        switch (operator1) {
            case '+' :
                rezultat2 = rezultat1 + z;
                break;
            case '-':
                rezultat2 = rezultat1 - z;
                break;
            case '*':
                rezultat2 = rezultat1 * z;
                break;
            case '/':
                rezultat2 = rezultat1/z;
                break;
            case '%':
                rezultat2 = rezultat1%z;
            default:
                System.out.println("Unesite ispravnu racunsku operaciju!");
        }
        System.out.println("Rezultat je " + rezultat2);

    }
}
