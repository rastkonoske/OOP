package javaTest;

import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Molimo unesite broj");
        int  broj = scan.nextInt();
        int broj1;

        do {
        System.out.println("Molim vas unesite sledeci broj");
        broj1 = scan.nextInt();
        broj = broj + broj1;
        System.out.println("Trenutni zbir je " + broj);
        } while (broj1 !=0);
        System.out.println("Uneli ste 0. Kraj programa");
    }
}
