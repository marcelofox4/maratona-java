package fox.marcelo.maratonajava.javacore.Npolimorfismo.domain;

public class Television extends Product {

    public static final double TAX_PERCENT = 0.1;

    public Television(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTax() {
        return this.price * TAX_PERCENT;
    }
}
