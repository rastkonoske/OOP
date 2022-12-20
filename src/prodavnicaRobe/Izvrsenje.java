package prodavnicaRobe;

import java.time.LocalDate;
import java.util.Scanner;

public class Izvrsenje {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
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

        Korpa korpa1 = new Korpa("");

        boolean kupovina = true;

        while (kupovina) {
            System.out.println("Unesite bar kod proizvoda koji zelite da dodate u korpu");
            String barKod = scan.nextLine();
            boolean pronadjen = false;
            if (barKod.equalsIgnoreCase("zavrsi kupovinu")) {
                kupovina = false;
                break;
            }
            for (Proizvod proizvod : niz) {
                if (barKod.equals(proizvod.getBarKod())) {
                    korpa1.addProizvod(proizvod);
                    System.out.println("Proizvod " + proizvod.getNaziv() + " je dodat u korpu.");
                    pronadjen = true;
                }
            }
            if (!pronadjen) {
                System.out.println("Uneli ste pogresan bar kod");
            }
        }
        korpa1.ispisiRacun();
    }
}
