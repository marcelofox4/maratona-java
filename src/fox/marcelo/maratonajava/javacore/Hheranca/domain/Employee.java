package fox.marcelo.maratonajava.javacore.Hheranca.domain;

public class Employee extends Person{

    //A Herança é utilizada quando se quer estender funcionalidades de uma Classe.
    //Acopla fortemente seu código.
    private double salary;

    public Employee(String name) {
        //No Construtor usa-se o super para acessar o construtor da classe que foi estendida.
        super(name);
    }

    //Sobreescrita de método da classe Pai.
    public void print() {
        //super serve para se referir a Classe Pai - Person
        super.print();
        System.out.println("Salário: " + this.salary);
    }

    public void paymentReport() {
        //Posso acessar o atributo name porque o modificador de acesso do atributo esta protected.
        System.out.println("Eu " + this.name + " recebi o salário de " + this.salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
