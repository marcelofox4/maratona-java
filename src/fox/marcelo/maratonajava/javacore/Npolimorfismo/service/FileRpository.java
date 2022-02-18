package fox.marcelo.maratonajava.javacore.Npolimorfismo.service;

import fox.marcelo.maratonajava.javacore.Npolimorfismo.repository.Repository;

public class FileRpository implements Repository {

    @Override
    public void save() {
        System.out.println("Salvando em um ARQUIVO...");
    }
}
