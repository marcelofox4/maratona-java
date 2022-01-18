package fox.marcelo.maratonajava.javacore.Bintrotucaometodos.test;

import fox.marcelo.maratonajava.javacore.Bintrotucaometodos.domain.Calculator;

public class CalculatorTest02 {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.multipliesTwoNumbers(2, 2);

        System.out.println("-----------------");

        double result = calculator.dividedTwoNumbers(2,2);
        System.out.println(result);
        System.out.println(calculator.dividedTwoNumbers(10,2));
    }
}
