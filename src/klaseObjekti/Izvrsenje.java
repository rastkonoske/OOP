package klaseObjekti;

import java.util.ArrayList;
import java.util.List;

public class Izvrsenje {

    public static void main(String[] args) {

        Osoba Pera = new Osoba("Pera", "Peric", 01-01-990-800-006, 254632);
        System.out.println(Pera.ispis());

        Osoba Marko = new Osoba("Marko", "Markovic", 02-01-990-800-006, 254633);
        System.out.println(Marko.ispis());

        Racun PerinRacun = new Racun(654-852-986-877-895-895, Pera);
        System.out.println(PerinRacun.dodajNovac(10000));
        System.out.println(PerinRacun.oduzmiNovac(8000));
        System.out.println(PerinRacun.oduzmiNovac(13000));

        Racun MarkovRacun = new Racun(654-852-986-877-895-896, Marko);
        System.out.println(MarkovRacun.dodajNovac(36000));
        System.out.println(MarkovRacun.oduzmiNovac(8000));
        System.out.println(MarkovRacun.oduzmiNovac(13000));


        Banka ListaRacuna = new Banka ();;
        ListaRacuna.dodajRacun(PerinRacun);
        ListaRacuna.dodajRacun(MarkovRacun);
        ListaRacuna.ispisRacuna();

        };

    }

