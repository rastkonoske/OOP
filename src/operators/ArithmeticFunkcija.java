package operators;

import java.util.Scanner;

public class ArithmeticFunkcija {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Molimo unesite prvi broj");
        int x = scanner.nextInt();
        System.out.println("Molimo unesite drugi broj");
        int y = scanner.nextInt();
        System.out.println("Molimo unesite racunsku operaciju");
        char operator = scanner.next().charAt(0);
        int vracenoIzFunkcije = racunanje(x,y,operator);


        System.out.println("Rezultat je " + vracenoIzFunkcije);

        System.out.println("Molimo unesite treci broj");
        int z = scanner.nextInt();
        System.out.println("Molimo unesite racunsku operaciju");
        char operator1 = scanner.next().charAt(0);
        int rezultat2 = racunanje(vracenoIzFunkcije, z, operator1);

        System.out.println("Rezultat je " + rezultat2);

    }

    public static int racunanje(int broj1, int broj2, char operator){
        int rezultat1;
        switch (operator) {
            case '+' :
                rezultat1 = broj1 + broj2;
                break;
            case '-':
                rezultat1 = broj1 - broj2;
                break;
            case '*':
                rezultat1 = broj1 * broj2;
                break;
            case '/':
                rezultat1 = broj1 / broj2;
                break;
            case '%':
                rezultat1 = broj1 % broj2;
                break;
            default:
                System.out.println("Unesite ispravnu racunsku operaciju!");
                rezultat1 = 1;
        }
        return rezultat1;
    }


}

