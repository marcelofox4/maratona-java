package fox.marcelo.maratonajava.javacore.Npolimorfismo.test;

import fox.marcelo.maratonajava.javacore.Npolimorfismo.domain.Computer;
import fox.marcelo.maratonajava.javacore.Npolimorfismo.domain.Tomato;
import fox.marcelo.maratonajava.javacore.Npolimorfismo.service.TaxCalculator;

public class ProductTest01 {
    public static void main(String[] args) {

        Computer computer = new Computer("Dell", 3500);
        Tomato tomato = new Tomato("Cereja", 10);

        TaxCalculator.calculatorTax(computer);
        System.out.println("-----------------------");
        TaxCalculator.calculatorTax(tomato);



    }
}
