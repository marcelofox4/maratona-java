package fox.marcelo.maratonajava.javacore.Npolimorfismo.test;

import fox.marcelo.maratonajava.javacore.Npolimorfismo.domain.Computer;
import fox.marcelo.maratonajava.javacore.Npolimorfismo.domain.Tomato;
import fox.marcelo.maratonajava.javacore.Npolimorfismo.service.TaxCalculator;

public class ProductTest03 {
    public static void main(String[] args) {

        Computer computer = new Computer("Sansung", 2000);

        Tomato tomato = new Tomato("Americano", 5);
        tomato.setExpirationDate("20/03/2022");

        TaxCalculator.calculatorTax(tomato);
        System.out.println("-------------------");
        TaxCalculator.calculatorTax(computer);
    }
}
