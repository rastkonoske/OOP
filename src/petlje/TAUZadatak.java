package petlje;

import java.util.Random;

public class TAUZadatak {
    public static void main(String[] args) {

        Random random = new Random();
        int poslednjePolje = 20;
        int predjenoPolja = 0;
        int pokusaj = 5;
        System.out.println("Odigrajte kockom");

        for (int i=1; i<=pokusaj; i++) {

            int die = random.nextInt(6) + 1;
            predjenoPolja = predjenoPolja + die;
            System.out.println("Bacanje " + i + ". Dobili ste broj " + die);

            if (predjenoPolja == poslednjePolje) {
                System.out.println("Dosli ste do polja " + predjenoPolja + " Uraaaaaaaaaa!");
            }

                else if (predjenoPolja>poslednjePolje) {
                System.out.println("Prebacili ste poslednje polje i ostajete na svom mestu");
            }
                else if (i==pokusaj && predjenoPolja<poslednjePolje) {
                System.out.println("Niste dostigli poslednje polje.");
            }
                else {
                int ostaloPolja = poslednjePolje - predjenoPolja;
                System.out.println("Trenutno ste na polju " + predjenoPolja + " i ostalo vam je jos " + ostaloPolja + " do kraja.");
            }
        }
    }
}
