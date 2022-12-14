package nasledjivanje;

public class Sweets extends Product{

    private double percentageSugar;
    public Sweets(String ProductName, double pricePerUnit, String UnitOfMeasurement, String ProductionCountry, double amount, double percentageSugar) {
        super(ProductName, pricePerUnit, UnitOfMeasurement, ProductionCountry, amount);
        this.percentageSugar = percentageSugar;
    }

    public double getPercentageSugar() {
        return percentageSugar;
    }

    public void setPercentageSugar(double percentageSugar) {
        this.percentageSugar = percentageSugar;
    }

    public void amountSugar () {
        double sugar = super.getAmount()* percentageSugar/100;
        System.out.println(sugar);
    }
}
