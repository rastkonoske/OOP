package prodavnicaKafe;

import java.util.Arrays;

public class Kafa {

    private String naziv;
    private int velicina;
    private String[] sastojci;
    private double cena;

    public Kafa (String naziv, int velicina, String[] sastojci, double cena) {
        this.naziv = naziv;
        this.velicina = velicina;
        this.sastojci = sastojci;
        this.cena = cena;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setVelicina(int velicina) {
        this.velicina = velicina;
    }

    public void setSastojci(String[] sastojci) {
        this.sastojci = sastojci;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getVelicina() {
        return velicina;
    }

    public String[] getSastojci() {
        return sastojci;
    }

    public double getCena() {
        return cena;
    }

    public double obracunajPopust(int popust) {
        return cena = cena - (cena * popust/100);
    }

    @Override
    public String toString() {
        return "Kafa{" +
                "naziv='" + naziv + '\'' +
                ", velicina=" + velicina +
                ", sastojci=" + Arrays.toString(sastojci) +
                ", cena=" + cena +
                '}';
    }
}
