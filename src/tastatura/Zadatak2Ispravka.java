package tastatura;

import java.util.Scanner;

public class Zadatak2Ispravka {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Molimo  unesite ime studenta");
        String ime = scanner.next();
        System.out.println("Molimo unesite prezime studenta");
        String prezime = scanner.next();
        System.out.println("Molimo unesite broj indeksa studenta");
        int brInd = scanner.nextInt();
        System.out.println("Molimo unesite prosek ocena studenta");
        float prosek = scanner.nextFloat();

        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("Br. ind: " + brInd);
        System.out.println("prosek: " + prosek);
    }
}
