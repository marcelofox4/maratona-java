package fox.marcelo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Car {

    private String name;
    private double maximumSpeed;
    // Modificador estatico. o atributo fica relacionado diretamente a Classe e não ao Objeto.
    // Todos os objetos ficam com o mesmo valor padrão.
    public static double limitSpeed = 250;

    public Car(String name, double maximumSpeed) {
        this.name = name;
        this.maximumSpeed = maximumSpeed;
    }

    public void print() {
        System.out.println("----------");
        System.out.println("Nome: " + this.name);
        System.out.println("Velocidade Máxima: " + this.maximumSpeed);
        System.out.println("Velocidade Limite: " + Car.limitSpeed);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(double maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

}
