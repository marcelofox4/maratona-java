package fox.marcelo.maratonajava.javacore.Npolimorfismo.service;

import fox.marcelo.maratonajava.javacore.Npolimorfismo.repository.Repository;

public class DatabaseRepository implements Repository {

    @Override
    public void save() {
        System.out.println("Salvando em um BANCO DE DADOS...");
    }
}
