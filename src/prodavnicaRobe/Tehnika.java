package prodavnicaRobe;

public class Tehnika extends Proizvod {

    private int garancija;
    private int tezina;

    public Tehnika(String barKod, String naziv, double cena, int garancija, int tezina) {
        super(barKod, naziv, cena);
        this.garancija = garancija;
        this.tezina = tezina;
    }

    public int getGarancija() {
        return garancija;
    }

    public void setGarancija(int garancija) {
        this.garancija = garancija;
    }

    public int getTezina() {
        return tezina;
    }

    public void setTezina(int tezina) {
        this.tezina = tezina;
    }

    @Override
    void poruci(int kolicina) {
        if (kolicina > 30) {
            System.out.println("Dostava do vrata");
        }
        double racun = getCena()*kolicina;
        System.out.println("Vas racun je: " + racun);
    }
}
