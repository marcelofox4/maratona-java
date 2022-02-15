package fox.marcelo.maratonajava.javacore.Npolimorfismo.test;

import fox.marcelo.maratonajava.javacore.Npolimorfismo.domain.Computer;
import fox.marcelo.maratonajava.javacore.Npolimorfismo.domain.Product;

public class ProductTest02 {
    public static void main(String[] args) {

        Product product01 = new Computer("Sansung", 2000);
        System.out.println(product01.getName());
        System.out.println(product01.getPrice());
        System.out.println(product01.calculateTax());

        System.out.println("-------------------");

        Product product02 = new Computer("Americano", 5);
        System.out.println(product02.getName());
        System.out.println(product02.getPrice());
        System.out.println(product02.calculateTax());
    }
}
