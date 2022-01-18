package fox.marcelo.maratonajava.javacore.Bintrotucaometodos.test;

import fox.marcelo.maratonajava.javacore.Bintrotucaometodos.domain.Person;

public class PersonTest01 {
    public static void main(String[] args) {

        Person person = new Person();

        person.setNome("Marcelo");
        person.setIdade(30);

        System.out.println(person.getNome());
        System.out.println(person.getIdade());

        System.out.println("----------------");

        person.print();
    }
}
