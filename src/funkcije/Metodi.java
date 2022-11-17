package funkcije;

import java.util.Scanner;

public class Metodi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Molimo unesite brojeve");
        int a = scan.nextInt();
        int b = scan.nextInt();
        addition(a,b);
        substraction(a,b);
        multiplication(a,b);
        division(a,b);
        modulus(a,b);
        exponentiation(a,b);
        floorDivision(a,b);

    }
    public static void addition(int a, int b) {
        System.out.println(a+b);
    }
    public static void substraction(int a, int b) {
        System.out.println(a - b);
    }
    public static void multiplication(int a, int b) {
        System.out.println(a * b);
    }
    public static void division(int a, int b) {
        System.out.println(a / b);
    }
    public static void modulus(int a, int b) {
        System.out.println(a % b);
    }
    public static void exponentiation(int a, int b) {
        System.out.println(Math.pow(a,b));
    }
    public static void floorDivision(int a, int b) {
        System.out.println(Math.floorDiv(a,b));
    }
}
