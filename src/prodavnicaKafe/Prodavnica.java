package prodavnicaKafe;

import java.util.Arrays;

public class Prodavnica {

     private static Kafa[] vrsta;
     private String adresa;
     private static int brojProdavnica = 0;
     private static int brojKupljenihProizvoda = 0;

     public Prodavnica (Kafa vrsta[], String adresa) {

         brojProdavnica++;
         Prodavnica.vrsta = vrsta;
         this.adresa = adresa;

     }

    public void setVrsta(Kafa[] vrsta) {
        Prodavnica.vrsta = vrsta;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void setBrojProdavnica(int brojProdavnica) {
        Prodavnica.brojProdavnica = brojProdavnica;
    }

    public void setBrojKupljenihProizvoda(int brojKupljenihProizvoda) {
        Prodavnica.brojKupljenihProizvoda = brojKupljenihProizvoda;
    }

    public Kafa[] getVrsta() {
        return vrsta;
    }

    public String getAdresa() {
        return adresa;
    }

    public  static  int getBrojProdavnica() {
        return brojProdavnica;
    }

    public int getBrojKupljenihProizvoda() {
        return brojKupljenihProizvoda;
    }

    public double kupiKafu (Kafa kafa, int kolicina) {

         return kolicina*kafa.getCena();
    }

    public void popust (int snizenje) {

         for (Kafa kafa : vrsta) {
             kafa.obracunajPopust(snizenje);
             System.out.println(kafa);
         }
    }


    public static Prodavnica najuspesnijaProdavnica (Prodavnica[] nizProdavnica) {

         int n=0;
         int max = brojKupljenihProizvoda;
         for (int i=0; i< nizProdavnica.length; i++) {
             if (max < nizProdavnica[i].brojKupljenihProizvoda) {
                 max = brojKupljenihProizvoda;
             }
             n=i;
        }

         return nizProdavnica[n];
    }

    @Override
    public String toString() {
        return "Prodavnica{" +
                "vrsta=" + Arrays.toString(vrsta) +
                ", adresa='" + adresa + '\'' +
                ", brojKupljenihProizvoda=" + brojKupljenihProizvoda +
                '}';
    }
}

