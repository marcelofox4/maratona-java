package fox.marcelo.maratonajava.javacore.Bintrotucaometodos.domain;

public class Employee {

    private String name;
    private int age;
    private double[] salary = new double[3];

    public void print() {
        System.out.println("Nome: " + this.name);
        System.out.println("Idade: " + this.age);
        for (int i = 0; i < this.salary.length; i++) {
            System.out.println("Salário " + (i + 1) + ": " + this.salary[i]);
        }
    }

    public void avarageSalary() {
        double sum = 0;
        for (double numbers : this.salary){
            sum += numbers;
        }
        double avarage = sum / this.salary.length;
        System.out.println("Média salarial: " + avarage);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getSalary() {
        return salary;
    }

    public void setSalary(double[] salary) {
        this.salary = salary;
    }
}
