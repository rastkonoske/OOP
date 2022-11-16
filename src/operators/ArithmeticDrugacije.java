package operators;

import java.util.Scanner;

public class ArithmeticDrugacije {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Molimo unesite prvi broj");
        int x = scanner.nextInt();
        System.out.println("Molimo unesite drugi broj");
        int y = scanner.nextInt();
        System.out.println("1 - sabiranje");
        System.out.println("2 - oduzimanje");
        System.out.println("3 - mnozenje");
        System.out.println("4 - deljenje");
        System.out.println("5 - ostatak pri deljenju");

        int operator = scanner.nextInt();
        int rezultat1 = 0;

        switch (operator) {
            case 1 :
                rezultat1 = x + y;
                break;
            case 2 :
                rezultat1 = x - y;
                break;
            case 3:
                rezultat1 = x * y;
                break;
            case 4:
                rezultat1 = x/y;
                break;
            case 5:
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

