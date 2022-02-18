package fox.marcelo.maratonajava.javacore.Npolimorfismo.domain;

public class Tomato extends Product {

    public static final double TAX_PERCENT = 0.06;
    private String expirationDate;

    public Tomato(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTax() {
        return this.price * TAX_PERCENT;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}
