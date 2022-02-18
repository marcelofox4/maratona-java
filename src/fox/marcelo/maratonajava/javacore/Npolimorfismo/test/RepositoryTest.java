package fox.marcelo.maratonajava.javacore.Npolimorfismo.test;

import fox.marcelo.maratonajava.javacore.Npolimorfismo.repository.Repository;
import fox.marcelo.maratonajava.javacore.Npolimorfismo.service.DatabaseRepository;
import fox.marcelo.maratonajava.javacore.Npolimorfismo.service.FileRpository;

public class RepositoryTest {
    public static void main(String[] args) {
        Repository databaseRepository = new DatabaseRepository();
        Repository fileRepository = new FileRpository();

        databaseRepository.save();
        fileRepository.save();
    }
}
