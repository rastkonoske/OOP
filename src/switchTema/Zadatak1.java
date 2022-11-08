package switchTema;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Molimo unesite redni broj dana");
        int dan = scanner.nextInt();

        switch (dan) {
            case 1:
                System.out.println("ponedeljak");
                break;
            case 2:
                System.out.println("utorak");
                break;
            case 3:
                System.out.println("sreda");
                break;
            case 4:
                System.out.println("cetvrtak");
                break;
            case 5:
                System.out.println("petak");
                break;
            case 6:
                System.out.println("subota");
                break;
            case 7:
                System.out.println("nedelja");
                break;
            default:
                System.out.println("Nedelja ima 7 dana!");
        }
    }
}
