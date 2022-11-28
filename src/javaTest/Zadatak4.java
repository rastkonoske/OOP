package javaTest;

import java.util.Scanner;

public class Zadatak4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Dobro dosli u nasu menjacnicu! Molimo unesite iznos u dinarima");
        double dinara = scan.nextDouble();
        System.out.println("Molimo unesite jednu od valuta: evro, franak ili dolar");
        String stranaValuta = scan.next();
        double rezultatValuta = menjacnica(dinara, stranaValuta);
        if (rezultatValuta == -1) {
            System.out.println("Ponovo pokrenite menjacnicu");
        } else {
            System.out.println(dinara + " dinara, kad se prebaci u " + stranaValuta + ", iznosi " + rezultatValuta + " u toj valuti");
        }

    }

    public static double menjacnica (double iznos, String valuta) {
        double rezultat;
        switch (valuta) {
            case "evro":
                rezultat = iznos*0.0085;
                break;
            case "franak":
                rezultat = iznos*0.0093;
                break;
            case "dolar":
                rezultat = iznos*0.010;
                break;
            default:
                System.out.println("Niste uneli ispravnu valutu");
                rezultat = -1;
        }
        return rezultat;
    }
}
