package ifElse;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Molimo unesite prvi broj x");
        int x = scanner.nextInt();
        System.out.println("Molimo unesite drugi broj y");
        int y = scanner.nextInt();

        if (x>0 && y>0) {
            System.out.println("Brojevi su veci od nule");
        } else if (x<0 && y<0){
            System.out.println("Brojevi su manji od nule");
        } else if (x>0 && y<0) {
            System.out.println("Broj x je veci od nule");
        } else if (x<0 && y>0) {
            System.out.println("Broj y je veci od nule");
        } else if (x== 0 || y==0) {
            System.out.println("Jedan od brojeva je jednak 0");
        }
    }
}
