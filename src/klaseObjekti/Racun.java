package klaseObjekti;

import java.util.Scanner;

public class Racun {

    private String brojRacuna;
    private double Stanje;
    private Osoba VlasnikRacuna;

    public Racun (String brojRacuna, Osoba VlasnikRacuna) {
        this.brojRacuna = brojRacuna;
        this.Stanje = 0;
        this.VlasnikRacuna = VlasnikRacuna;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public String getBrojRacuna() {
        return brojRacuna;
    }

    public void setVlasnikRacuna(Osoba vlasnikRacuna) {
        VlasnikRacuna = vlasnikRacuna;
    }

    public Osoba getVlasnikRacuna() {
        return VlasnikRacuna;
    }

    public double getStanje() {
        return Stanje;
    }

    public double dodajNovac (double prihod) {
        return Stanje = Stanje + prihod;
    }

    public double oduzmiNovac (double rashod) {
        Stanje = Stanje - rashod;
        if (Stanje< -10000) {
            Stanje = Stanje + rashod;
        }
        return Stanje;
    }
}
