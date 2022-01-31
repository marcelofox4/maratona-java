package fox.marcelo.maratonajava.javacore.Fmodificadorestatico.test;

import fox.marcelo.maratonajava.javacore.Fmodificadorestatico.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {

        Car car = new Car("BMW", 280);
        Car car2 = new Car("Mercedes", 275);
        Car car3 = new Car("Audi", 290);

        // O atributo static fica relacionado diretamente com a Classe.
        Car.setLimitSpeed(180);

        car.print();
        car2.print();
        car3.print();
    }
}
