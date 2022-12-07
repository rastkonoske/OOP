package klaseObjekti;

import java.util.ArrayList;
import java.util.List;

public class Banka {

    private List<Racun> RacuniBanka = new ArrayList<Racun>();
    private Osoba VlasnikRacuna = new Osoba("ime", "prezime", 1, 2);
    private Racun BankaRacun = new Racun(0, VlasnikRacuna);

    public Banka () {
        this.RacuniBanka = RacuniBanka;
    }

    public void setVlasnikRacuna(Osoba vlasnikRacuna) {
        VlasnikRacuna = vlasnikRacuna;
    }

    public Osoba getVlasnikRacuna() {
        return VlasnikRacuna;
    }

    public void setBankaRacun(Racun bankaRacun) {
        BankaRacun = bankaRacun;
    }

    public Racun getBankaRacun() {
        return BankaRacun;
    }

    public void setRacuniBanka(List<Racun> racuniBanka) {
        RacuniBanka = racuniBanka;
    }

    public List<Racun> getRacuniBanka() {
        return RacuniBanka;
    }

    public List<Racun> dodajRacun (Racun BankaRacun) {

        RacuniBanka.add(BankaRacun);
        return RacuniBanka;
    }

}
