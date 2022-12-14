package nasledjivanje;

public class Milk extends Product{

    private double percentageMilkFat;

    public Milk(String ProductName, double pricePerUnit, String UnitOfMeasurement, String ProductionCountry, double amount, double percentageMilkFat) {
        super(ProductName, pricePerUnit, UnitOfMeasurement, ProductionCountry, amount);
        this.percentageMilkFat = percentageMilkFat;
    }

    public double getPercentageMilkFat() {
        return percentageMilkFat;
    }

    public void setPercentageMilkFat(double percentageMilkFat) {
        this.percentageMilkFat = percentageMilkFat;
    }

    public void amountMilkFat () {
        double milkFat = super.getAmount()* percentageMilkFat/100;
        System.out.println(milkFat);
    }
}
