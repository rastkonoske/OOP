package dodatno.vezba;

public class Torta {

    protected String ukus;
    protected double cena;

    public Torta (String ukus) {
        this.ukus = ukus;
    }

    public String getUkus() {
        return ukus;
    }

    public double getCena() {
        return cena;
    }

    public void setUkus(String ukus) {
        this.ukus = ukus;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

}
