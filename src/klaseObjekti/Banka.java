package klaseObjekti;

import java.util.ArrayList;
import java.util.List;

public class Banka {

    private List<Racun> RacuniBanka = new ArrayList<Racun>();

    public Banka () {
        this.RacuniBanka = RacuniBanka;
    }

    public List<Racun> getRacuniBanka() {
        return RacuniBanka;
    }
    public List<Racun> dodajRacun (Racun BankaRacun) {

        RacuniBanka.add(BankaRacun);
        return RacuniBanka;
    }

    public void ispis()
    {
        for(Racun racun : RacuniBanka)
        {
            System.out.println(racun.getVlasnikRacuna() + " " + racun.getBrojRacuna() + " " + racun.getStanje());
        }
    }

}
