package prodavnicaRobe;

import java.time.LocalDate;

public class Izvrsenje {
    public static void main(String[] args) {
        Proizvod mleko = new Prehrambeni("475sdi7", "mleko", 100, LocalDate.of(2022,12,30));
        Proizvod sporet = new Tehnika("345kh3", "sporet", 35000, 5, 40);
        Proizvod pivo = new AlkoholnaPica("654k33", "pivo", 120, "staklena", 10);
        Proizvod sokBreskva = new Pica("774gg", "sok breskva", 200, "kartonska");
        Proizvod[] niz = {mleko, sporet, pivo, sokBreskva};

        for (Proizvod proizvod: niz) {
            if (proizvod.getCena() > 200) {
                proizvod.setPopust(15);
            }
            if (proizvod instanceof AlkoholnaPica) {
                proizvod.setPopust(50);
            }
        }

        System.out.println(mleko);
        System.out.println(sporet);
        System.out.println(pivo);
        System.out.println(sokBreskva);

        for (Proizvod proizvod :niz) {
            proizvod.poruci(10);
        }
    }
}
