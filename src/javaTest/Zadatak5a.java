package javaTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadatak5a {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Integer> nizBrojeva = new ArrayList<>();
        nizBrojeva.add(3);
        nizBrojeva.add(4);
        nizBrojeva.add(4);
        nizBrojeva.add(32);
        nizBrojeva.add(54);
        nizBrojeva.add(26);
        nizBrojeva.add(75);
        nizBrojeva.add(88);
        nizBrojeva.add(4);
        nizBrojeva.add(19);

        System.out.println("Unesite broj koji zelite da prebrojite");
        int a = scan.nextInt();

        int broj = brojac(nizBrojeva, a);
        if (broj > 0) {
            System.out.println("Uneti broj se pojavljuje " + broj + " puta u nasem nizu brojeva.");
        }
        else {
            System.out.println("Uneti broj se ne pojavljuje u nasem nizu brojeva.");
        }

    }

    public static int brojac(List<Integer> niz, int x) {

        int count = 0;
        for (int i = 0; i < niz.size(); i++) {
            if (niz.get(i) == x) {
                count++;
            }
        } return count;
    }
}
