package fox.marcelo.maratonajava.javacore.Npolimorfismo.service;

import fox.marcelo.maratonajava.javacore.Npolimorfismo.domain.Computer;
import fox.marcelo.maratonajava.javacore.Npolimorfismo.domain.Tomato;

public class TaxCalculator {

    public static void calculatorTaxComputer(Computer computer) {
        System.out.println("Relatório de Imposto do Computador?");
        double tax = computer.calculateTax();
        System.out.println("Computado: " + computer.getName());
        System.out.println("Preço: " + computer.getPrice());
        System.out.println("Imposto a ser pago: " + tax);
    }

    public static void calculatorTaxTomato(Tomato tomato) {
        System.out.println("Relatório de Imposto do Tomate");
        double tax = tomato.calculateTax();
        System.out.println("Tomate: " + tomato.getName());
        System.out.println("Preço: " + tomato.getPrice());
        System.out.println("Imposto a ser pago: " + tax);
    }
}
