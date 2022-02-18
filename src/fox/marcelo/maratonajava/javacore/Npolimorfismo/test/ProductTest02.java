package fox.marcelo.maratonajava.javacore.Npolimorfismo.test;

import fox.marcelo.maratonajava.javacore.Npolimorfismo.domain.Computer;
import fox.marcelo.maratonajava.javacore.Npolimorfismo.domain.Product;
import fox.marcelo.maratonajava.javacore.Npolimorfismo.domain.Television;
import fox.marcelo.maratonajava.javacore.Npolimorfismo.domain.Tomato;
import fox.marcelo.maratonajava.javacore.Npolimorfismo.service.TaxCalculator;

public class ProductTest02 {
    public static void main(String[] args) {

        Product product01 = new Computer("Sansung", 2000);
        TaxCalculator.calculatorTax(product01);

        System.out.println("-------------------");

        Product product02 = new Tomato("Americano", 5);
        System.out.println(product02.getName());
        System.out.println(product02.getPrice());
        System.out.println(product02.calculateTax());

        System.out.println("-------------------");

        Television television = new Television("Sansung 55\"", 5000);
        TaxCalculator.calculatorTax(television);
    }
}
