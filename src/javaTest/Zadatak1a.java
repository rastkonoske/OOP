package javaTest;

import java.util.ArrayList;
import java.util.List;

public class Zadatak1a {

    public static void main(String[] args) {

        List<Integer> niz = new ArrayList<>();
        niz.add(15);
        niz.add(56);
        niz.add(48);
        niz.add(32);
        niz.add(66);
        niz.add(47);
        niz.add(17);
        niz.add(6);
        niz.add(89);
        niz.add(84);
        niz.add(77);

        int min = niz.get(0);

        for (int i = 0; i<niz.size(); i++) {
            if (min>niz.get(i)) {
                min=niz.get(i);
            }
        }
        System.out.println("Najmanji broj u nizu je " + min);
    }
}

