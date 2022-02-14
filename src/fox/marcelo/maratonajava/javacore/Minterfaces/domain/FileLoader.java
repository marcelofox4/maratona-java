package fox.marcelo.maratonajava.javacore.Minterfaces.domain;

public class FileLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Carregando dados de um Arquivo...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um Arquivo...");
    }
}
