package nasledjivanje;

public class Izvrsenje {
    public static void main(String[] args) {
        Product Kafa = new Product("Kafa", 100, "100 gr", "Ekvador", 90);
        Kafa.print();
        Kafa.calculatePrice();

        Milk Punomasno = new Milk("Punomasno", 150, "1 l", "Srbija", 20, 3.5);
        Punomasno.print();
        Punomasno.calculatePrice();
        Punomasno.amountMilkFat();

        Sweets Cokolada = new Sweets("Cokolada", 120, "100g", "Srbija", 10, 11);
        Cokolada.print();
        Cokolada.calculatePrice();
        Cokolada.amountSugar();
    }
}
