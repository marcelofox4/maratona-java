package fox.marcelo.maratonajava.javacore.Aintroducaoclasses.test;

import fox.marcelo.maratonajava.javacore.Aintroducaoclasses.domain.Car;

//Crie uma classe Carro com os seguintes atributos:
//- nome;
//- modelo;
//- ano;
//Em seguida, crie dois objetos distintos e imprima seus atributos.

public class TestCar01 {
    public static void main(String[] args) {
        Car car01 = new Car();
        Car car02 = new Car();

        car01.name = "Volkswagen";
        car01.model = "Fox";
        car01.year = 2013;

        car02.name = "Renault";
        car02.model = "Sandero";
        car02.year = 2018;

        System.out.println("Nome: " + car01.name + " - Modelo: " + car01.model + " - Ano: " + car01.year);
        System.out.println("Nome: " + car02.name + " - Modelo: " + car02.model + " - Ano: " + car02.year);
    }
}
