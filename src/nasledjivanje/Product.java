package nasledjivanje;

public class Product {

    private String ProductName;
    private double pricePerUnit;
    private String UnitOfMeasurement;
    private String ProductionCountry;
    private double amount;

    public Product (String ProductName, double pricePerUnit, String UnitOfMeasurement, String ProductionCountry, double amount) {
        this.ProductName = ProductName;
        this.pricePerUnit = pricePerUnit;
        this.UnitOfMeasurement = UnitOfMeasurement;
        this.ProductionCountry = ProductionCountry;
        this.amount = amount;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public String getUnitOfMeasurement() {
        return UnitOfMeasurement;
    }

    public void setUnitOfMeasurement(String unitOfMeasurement) {
        UnitOfMeasurement = unitOfMeasurement;
    }

    public String getProductionCountry() {
        return ProductionCountry;
    }

    public void setProductionCountry(String productionCountry) {
        ProductionCountry = productionCountry;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void print () {
        System.out.println("Ime proizvoda: " + this.ProductName);
        System.out.println("Cena po jedinici mere: " + this.pricePerUnit);
        System.out.println("Jedinica mere: " + this.UnitOfMeasurement);
        System.out.println("Zemlja porekla: " + this.ProductionCountry);
        System.out.println("Kolicina: " + this.amount);
    }

    public void calculatePrice() {
        double price = amount * pricePerUnit;
        System.out.println(price);
    }
}
