package klaseObjekti;

import java.util.Scanner;

public class Racun {

    private long brojRacuna;
    private double Stanje = 0;
    private Osoba VlasnikRacuna = new Osoba("ime", "prezime", 1, 2);

    public Racun (long brojRacuna, Osoba VlasnikRacuna) {
        this.brojRacuna = brojRacuna;
        this.Stanje = 0;
        this.VlasnikRacuna = VlasnikRacuna;
    }

    public void setBrojRacuna(long brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public long getBrojRacuna() {
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
            Stanje = -10000;
        }
        return Stanje;
    }
}
