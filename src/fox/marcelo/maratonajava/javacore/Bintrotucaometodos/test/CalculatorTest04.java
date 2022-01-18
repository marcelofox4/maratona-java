package fox.marcelo.maratonajava.javacore.Bintrotucaometodos.test;

import fox.marcelo.maratonajava.javacore.Bintrotucaometodos.domain.Calculator;

public class CalculatorTest04 {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int[] numbers = {1, 2, 3, 4, 5};

        calculator.sumArray(numbers);

        //Com o VarArgs não é preciso criar um array, é possível passar os argumentos direto no método
        calculator.sumVarArgs(1, 2, 3, 4, 5, 6);

    }
}
