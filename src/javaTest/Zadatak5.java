package javaTest;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {


        int nizBrojeva[] = {3, 4, 4, 32, 54, 26, 75, 88, 93, 19};
        System.out.println("Unesite broj koji zelite da prebrojite");

        int broj = brojac(nizBrojeva);
        if (broj > 0) {
            System.out.println("Uneti broj se pojavljuje " + broj + " puta u nasem nizu brojeva.");
        }
        else {
            System.out.println("Uneti broj se ne pojavljuje u nasem nizu brojeva.");
        }

    }

    public static int brojac(int niz[]) {

        Scanner scan = new Scanner(System.in);
        int count = 0;
        int x = scan.nextInt();
                for (int i = 0; i < niz.length; i++) {
                    if (niz[i] == x) {
                        count++;
                    }
        } return count;
    }
}
