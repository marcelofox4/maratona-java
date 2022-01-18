package fox.marcelo.maratonajava.javacore.Bintrotucaometodos.test;

//Crie uma Classe Funcionário com os seguintes atributos:
//- nome;
//- idade;
//- salario (três salários devem ser guardados)
//
//Crie dois métodos:
//- Para imprimir os dados;
//- Para tirar a média dos salários e imprimir o resultado.

import fox.marcelo.maratonajava.javacore.Bintrotucaometodos.domain.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        double[] salary = new double[3];
        salary[0] = 3000;
        salary[1] = 2000;
        salary[2] = 4000;

        employee.setName("Marcelo");
        employee.setAge(30);
        employee.setSalary(salary);

        employee.print();
        employee.avarageSalary();

    }
}
