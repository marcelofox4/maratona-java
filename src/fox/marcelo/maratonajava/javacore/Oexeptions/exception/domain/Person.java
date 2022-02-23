package fox.marcelo.maratonajava.javacore.Oexeptions.exception.domain;

import java.io.FileNotFoundException;

public class Person {

    public void save() throws InvalidLoginException, FileNotFoundException {
        System.out.println("Salvando Pessoa");
    }
}
