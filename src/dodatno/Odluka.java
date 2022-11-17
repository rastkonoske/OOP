package dodatno;

import java.util.Scanner;

public class Odluka {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        for (int i=1; i<=3; i++) {
            System.out.println("Unesite sledujuci broj pripadnika cete");
            int ljudiSleduje = scan.nextInt();
            System.out.println("Unesite imajuci broj pripadnika cete");
            int ljudiIma = scan.nextInt();
            System.out.println("Unesite sledujuci broj motornih vozila cete");
            int vozilaSleduje = scan.nextInt();
            System.out.println("Unesite imajuci broj motornih vozila cete");
            int vozilaIma = scan.nextInt();
            if(ljudiSleduje/2 <= ljudiIma){
                if (vozilaSleduje/2<=vozilaIma){
                    System.out.println("Tezisni zadatak " + i + "cete danas ce biti periodicni pregled motornih vozila.");
                } else {
                    System.out.println("Tezisni zadatak " + i + "cete danas ce biti gadjanje iz pesadijskog naoruzanja.");
                }
            } else {
                if(vozilaSleduje/2<=vozilaIma){
                    System.out.println("Tezisni zadatak " + i + "cete danas ce biti takticka obuka.");
                }
                else {
                    System.out.println("Tezisni zadatak " + i + "cete danas ce biti uredjenje kasarnskog kruga.");
                }
            }
        }
    }
}
