package switchTema;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Molimo unesite dan da pregledate obaveze iz nedeljnog plana rada");
        String dan = scanner.next();

        switch (dan) {
            case "ponedeljak":
                System.out.println("Sastanak PMHT, " + "Prijem 2 vojnika u PVS");
                break;
            case "utorak":
                System.out.println("Otpust junske klase vojnika, " + "nedeljni izvestaj");
                break;
            case "sreda":
                System.out.println("terenska obuka");
                break;
            case "cetvrtak":
                System.out.println("naredjenje sa zadacima sa radnog sastanka, " + "obracun radne liste");
                break;
            case "petak":
                System.out.println("sastanak komande, " + "priprema OUS");
                break;
            case "subota":
                System.out.println("dezurni");
                break;
            case "nedelja":
                System.out.println("Konacno kuci!!!");
                break;
            default:
                System.out.println("Ovaj dan ne postoji!");
        }
    }
}
