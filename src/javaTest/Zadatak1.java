package javaTest;

public class Zadatak1 {

    public static void main(String[] args) {

        int[] niz = {15,56,48,32,66,47,17,6,89,84,77};

        int min = niz[0];

        for (int i=0; i<niz.length; i++) {
            if (min>niz[i]) {
                min=niz[i];
            }
        }
        System.out.println("Najmanji broj u nizu je " + min);
    }
}
