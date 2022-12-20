package prodavnicaRobe;

import java.time.LocalDate;

public class Prehrambeni extends Proizvod{

    private LocalDate datumIsteka;

    public Prehrambeni(String barKod, String naziv, double cena, LocalDate datumIsteka) {
        super(barKod, naziv, cena);
        this.datumIsteka = datumIsteka;
    }

    public LocalDate getDatumIsteka() {
        return datumIsteka;
    }

    public void setDatumIsteka(LocalDate datumIsteka) {
        this.datumIsteka = datumIsteka;
    }

    @Override
    void poruci(int kolicina) {

        if (datumIsteka.isBefore(LocalDate.now())) {
            System.out.println("Datum istekao!!!");
        } else {
            double racun = getCena() * kolicina;
            System.out.println("Vas racun je: " + racun);
        }

    }
}
