package fox.marcelo.maratonajava.javacore.Jmodificadorfinal.domain;

// O modificador final utilizado em Classes é para sinalizar que ela NÃO pode ser Estendida.
public final class Car {

    private String name;

    // O final é utilizado para criar Constantes.
    // A inicialização é obrigatoria.
    // O nome da Constante fica em UPPERCASE.
    // Não é possível modificar esse valor no main.
    public static final double LIMIT_SPEED = 250;

    // A referência que a variável buyer tem para esse Objeto não pode ser alterada.
    // Os valores dos atributos do Objeto podem ser alterados.
    public final Buyer BUYER = new Buyer();

    // Usado em métodos o final sinaliza que não é possível sobrescrever o método.
    public final void print() {
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
