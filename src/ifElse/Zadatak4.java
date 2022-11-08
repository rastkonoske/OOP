package ifElse;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Molimo unesite ime");
        String ime = scanner.next();
        System.out.println("Molimo unesite prezime");
        String prezime = scanner.next();
        System.out.println("Molimo unesite godinu rodjenja");
        int godRodjenja = scanner.nextInt();

        if (godRodjenja<= 2004) {
            System.out.println(ime + " " + prezime + " je punoletan");
        } else {
            System.out.println(ime + " " + prezime + " nije punoletan");
        }
    }
}
