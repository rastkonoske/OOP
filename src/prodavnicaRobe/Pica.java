package prodavnicaRobe;

public class Pica extends Proizvod{
    private String ambalaza;

    public Pica(String barKod, String naziv, double cena, String ambalaza) {
        super(barKod, naziv, cena);
        this.ambalaza = ambalaza;
    }

    public String getAmbalaza() {
        return ambalaza;
    }

    public void setAmbalaza(String ambalaza) {
        this.ambalaza = ambalaza;
    }

    @Override
    void poruci(int kolicina) {
         double cenaAmbalaze=0;
         switch (ambalaza) {
             case "kartonska":
                 cenaAmbalaze = getCena() * 0.1;
                 break;
             case "plasticna":
                 cenaAmbalaze = getCena() * 0.2;
                 break;
             case "staklena":
             case "limenka":
                 cenaAmbalaze = getCena() * 0.3;
                 break;
                 default:
                     System.out.println("Molimo unesite ispravno jednu od cetiri ambalze u konstruktor: kartonska, plasticna, staklena ili limenka");
         }
        double racun = (getCena()+cenaAmbalaze)*kolicina;
        System.out.println("Vas racun je: " + racun);
    }
}
