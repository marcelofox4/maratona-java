package fox.marcelo.maratonajava.javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Carregando dados do Banco de dados...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo do Banco de Dados...");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro da Classe - retriveMaxDataSize");
    }
}
