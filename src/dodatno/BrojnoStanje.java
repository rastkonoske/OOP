package dodatno;

import java.util.Scanner;

public class BrojnoStanje {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Komanda
        System.out.println("Unesite broj prisutnih pripadnika Komande bataljona");
        int nlKom = scan.nextInt();
        System.out.println("Unesite broj odsutnih pripadnika Komande bataljona");
        int rasKom = scan.nextInt();
        elementi(18, nlKom, rasKom);


        //Prva ceta
        System.out.println("Unesite broj prisutnih pripadnika Prve cete");
        int nlprva = scan.nextInt();
        System.out.println("Unesite broj odsutnih pripadnika Prve cete");
        int rasprva = scan.nextInt();
        elementi(127, nlprva, rasprva);

        //Druga ceta
        System.out.println("Unesite broj prisutnih pripadnika Druge cete");
        int nldruga = scan.nextInt();
        System.out.println("Unesite broj odsutnih pripadnika Druge cete");
        int rasdruga = scan.nextInt();
        elementi(113, nldruga, rasdruga);

        //Treca ceta
        System.out.println("Unesite broj prisutnih pripadnika Trece cete");
        int nltreca = scan.nextInt();
        System.out.println("Unesite broj odsutnih pripadnika Trece cete");
        int rastreca = scan.nextInt();
        elementi(84, nltreca, rastreca);

        //Ukupno
        int naLicuBat = nlKom + nlprva + nldruga + nltreca;
        int rashodBat = rasKom + rasprva + rasdruga + rastreca;
        int popunjenoBat = naLicuBat + rashodBat;
        int SledujeBat = 342;
        int upraznjenoBat = SledujeBat - naLicuBat - rashodBat;
        System.out.println("Bataljon sleduje: " + SledujeBat);
        System.out.println("Bataljon popunjeno: " + popunjenoBat);
        System.out.println("Bataljon na licu: " + naLicuBat);
        System.out.println("Bataljon rashod: " + rashodBat);
        System.out.println("Bataljon upraznjeno: " + upraznjenoBat);

    }

    public static void elementi (int sleduje, int naLicu, int rashod) {
        int popunjeno = naLicu + rashod;
        int upraznjeno = sleduje - popunjeno;
        System.out.println("Sleduje: " + sleduje);
        System.out.println("Popunjeno: " + popunjeno);
        System.out.println("Na licu: " + naLicu);
        System.out.println("Rashod: " + rashod);
        System.out.println("Upraznjeno: " + upraznjeno);
    }
}
