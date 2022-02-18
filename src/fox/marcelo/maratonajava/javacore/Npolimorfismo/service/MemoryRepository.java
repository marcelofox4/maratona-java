package fox.marcelo.maratonajava.javacore.Npolimorfismo.service;

import fox.marcelo.maratonajava.javacore.Npolimorfismo.repository.Repository;

public class MemoryRepository implements Repository {

    @Override
    public void save() {
        System.out.println("Salvando na MEMÓRIA...");
    }
}
