package prodavnicaKafe;

import java.util.Arrays;

public class Izvrsenje {

    public static void main(String[] args) {

        Kafa turskaMala = new Kafa ("Turska Mala",  100, new String[]{"moka", "arabika"},90);
        Kafa turskaVelika = new Kafa ("Turska Velika",  200, new String[]{"moka", "arabika"},170);
        Kafa espreso = new Kafa("Espreso", 100, new String[]{"robusta", "arabika"}, 120);
        Kafa cikorija = new Kafa("Cikorija", 200, new String[]{"cikorija", "robusta"}, 100);

        Kafa[] niz1 = {turskaMala, espreso};
        Kafa[] niz2 = {turskaMala, turskaVelika, cikorija};

        Prodavnica Manjaca = new Prodavnica(niz1, "Svetosavska 2");
        Prodavnica Zmijanje = new Prodavnica(niz2, "Sumadijska 4");
        Prodavnica [] nizProdavnica = {Manjaca, Zmijanje};

        System.out.println(Prodavnica.getBrojProdavnica());

        Manjaca.kupiKafu(turskaMala, 2);
        Zmijanje.kupiKafu(turskaVelika, 1);
        Zmijanje.kupiKafu(cikorija, 3);

        System.out.println(Prodavnica.najuspesnijaProdavnica(nizProdavnica));

        Prodavnica.najuspesnijaProdavnica(nizProdavnica).popust(20);

      //  ispisSaPopustom(niz2, nizProdavnica);

    }

    /*   public static void ispisSaPopustom (Kafa[] nizKafa, Prodavnica[] nizProdavnica) {
        for (Kafa kafa: nizKafa) {
            System.out.println("Ime kafe je: " + kafa.getNaziv() + "Cena kafe je: " + kafa.getCena());
        }
    }*/

}
