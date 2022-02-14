package fox.marcelo.maratonajava.javacore.Minterfaces.domain;

public interface DataLoader {

    // Todos os atributos em uma interface é uma CONSTANTE.
    public static final int MAX_DATA_SIZE = 10;

    // Todos os métodos são abstratos e publicos.
    // Quando estendida as interfaces, os métodos devem ser implementados.
    // Uma classe pode implementar várias interfaces.
    public abstract void load();

    // Serve para implementar o método dentro da própria interface.
    default void checkPermission() {
        System.out.println("Checando Permissões");
    }

    // É possível a criação de métodos estáticos.
    // Eles nunca podem ser sobrescritos.
    public static void retrieveMaxDataSize() {
        System.out.println("Dentro da interface - retriveMaxDataSize");
    }
}
