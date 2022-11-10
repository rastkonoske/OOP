package operators;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Logical {
    public static void main(String[] args){

        LocalDate today = LocalDate.now();
        int godinaDanas = today.getYear();
        int mesecDanas = today.getMonthValue();
        int danDanas = today.getDayOfMonth();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Molimo unesite godinu rodjenja");
        int godinaRodj = scanner.nextInt();
        System.out.println("Molimo unesite mesec rodjenja");
        int mesecRodj = scanner.nextInt();
        System.out.println("Molimo unesite dan rodjenja");
        int danRodj = scanner.nextInt();
        int razlikaGod = godinaDanas - godinaRodj;



        if (razlikaGod >18 || (razlikaGod == 18 && mesecDanas > mesecRodj) || (razlikaGod == 18 && mesecDanas == mesecRodj && danDanas>=danRodj)) {
            System.out.println("Imate preko 18 godina. Punoletni ste!");
        } else {
            System.out.println("Imate manje od 18 godina. Maloletni ste.");
        }
    }
}
