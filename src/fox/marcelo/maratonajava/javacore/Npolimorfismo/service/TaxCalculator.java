package fox.marcelo.maratonajava.javacore.Npolimorfismo.service;

import fox.marcelo.maratonajava.javacore.Npolimorfismo.domain.Product;
import fox.marcelo.maratonajava.javacore.Npolimorfismo.domain.Tomato;

public class TaxCalculator {

    public static void calculatorTax(Product product) {
        System.out.println("Relatório de Imposto");
        double tax = product.calculateTax();
        System.out.println("Produto: " + product.getName());
        System.out.println("Preço: " + product.getPrice());
        System.out.println("Imposto a ser pago: " + tax);

        if (product instanceof Tomato) {
            Tomato tomato = (Tomato) product;
            System.out.println("Data de Validade: " + tomato.getExpirationDate());
//            System.out.println("Data de Validade: " + ((Tomato) product).getExpirationDate());
        }
    }

}
