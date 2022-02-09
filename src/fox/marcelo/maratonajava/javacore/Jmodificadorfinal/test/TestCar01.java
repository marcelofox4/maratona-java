package fox.marcelo.maratonajava.javacore.Jmodificadorfinal.test;

import fox.marcelo.maratonajava.javacore.Jmodificadorfinal.domain.Car;

public class TestCar01 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setName("Ferrari");
        System.out.println(Car.LIMIT_SPEED);
        car.print();

        System.out.println("---------------------");

        System.out.println(car.BUYER);
        car.BUYER.setName("Marcelo");
        System.out.println(car.BUYER);
    }
}
