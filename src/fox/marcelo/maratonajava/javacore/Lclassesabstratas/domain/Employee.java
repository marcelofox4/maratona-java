package fox.marcelo.maratonajava.javacore.Lclassesabstratas.domain;

// Quando a classe é abstrata ela fica como um "template".
// Não pode ser estaciada como objeto.
// Esse tipo de classe é criada basicamente para ser extendida por uma subclasse mais específica.
public abstract class Employee extends Person{

    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.calculateBonus();
    }

    @Override
    public void print() {
        System.out.println("Imprimindo...");
    }

    // As subclasses ficam obrigadas a implementar esse método.
    // Não é possível criar métodos abstratos fora de classes abstratas.
    public abstract void calculateBonus();


}
