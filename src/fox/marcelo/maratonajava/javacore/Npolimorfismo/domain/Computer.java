package fox.marcelo.maratonajava.javacore.Npolimorfismo.domain;

public class Computer extends Product {

    public static final double TAX_PERCENT = 0.20;

    public Computer(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTax() {
        return this.price * TAX_PERCENT;
    }

}
