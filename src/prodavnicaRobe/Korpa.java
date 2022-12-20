package prodavnicaRobe;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Scanner;

public class Korpa {
    Scanner scan = new Scanner(System.in);
    private String kupac ;
    HashMap<Proizvod, Integer> proizvodi = new HashMap<Proizvod, Integer>();


    public Korpa(String kupac) {
        System.out.println("Molimo unesite ime kupca");
        kupac = scan.next();
        this.kupac = kupac;
    }

    public String getKupac() {
        return kupac;
    }

    public void setKupac(String kupac) {
        this.kupac = kupac;
    }

    public HashMap<Proizvod, Integer> getProizvodi() {
        return proizvodi;
    }

    public void addProizvod(Proizvod proizvod) {
        if (proizvodi.containsKey(proizvod)) {
            proizvodi.put(proizvod, proizvodi.get(proizvod) + 1);
        }
        else {
            proizvodi.put(proizvod, 1);
        }
    }

    public void ispisiRacun () {
        double racun = 0;
        for(Proizvod proizvodUKorpi : this.proizvodi.keySet()) {
            double ukupnaCena = proizvodUKorpi.getCena() * this.proizvodi.get(proizvodUKorpi);
            System.out.println(proizvodUKorpi.getNaziv() + " x" + this.proizvodi.get(proizvodUKorpi) + " " + ukupnaCena);
            racun+=ukupnaCena;
        }
        System.out.println("Za uplatu: " + racun);
    }
    
}
