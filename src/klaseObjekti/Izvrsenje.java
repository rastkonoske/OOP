package klaseObjekti;

import java.util.ArrayList;
import java.util.List;

public class Izvrsenje {

    public static void main(String[] args) {

        Osoba Pera = new Osoba("Pera", "Peric", "0101990800006", 254632);
        System.out.println(Pera.ispis());

        Osoba Marko = new Osoba("Marko", "Markovic", "0201990800006", 254633);
        System.out.println(Marko.ispis());

        Racun PerinRacun = new Racun("654852986877895895", Pera);
        System.out.println(PerinRacun.dodajNovac(10000));
        System.out.println(PerinRacun.oduzmiNovac(8000));
        System.out.println(PerinRacun.oduzmiNovac(13000));

        Racun MarkovRacun = new Racun("654852986877895896", Marko);
        System.out.println(MarkovRacun.dodajNovac(36000));
        System.out.println(MarkovRacun.oduzmiNovac(8000));
        System.out.println(MarkovRacun.oduzmiNovac(13000));


        Banka ListaRacuna = new Banka ();;
        ListaRacuna.dodajRacun(PerinRacun);
        ListaRacuna.dodajRacun(MarkovRacun);
        ListaRacuna.ispisRacuna();

        };

    }

