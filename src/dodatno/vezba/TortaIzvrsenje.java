package dodatno.vezba;

public class TortaIzvrsenje {

    public static void main(String[] args) {

        RodjendanskaTorta Torta1 = new RodjendanskaTorta("jagoda");
        Torta1.setCena(4500);
        Torta1.setSvece(8);
        SvadbenaTorta Torta2 = new SvadbenaTorta("cokolada");
        Torta2.setCena(6000);
        Torta2.setSlojeva(3);

        System.out.println(Torta1.getUkus()+" "+Torta1.getCena());
        System.out.println(Torta2.getUkus()+" "+Torta2.getCena());
    }
}
