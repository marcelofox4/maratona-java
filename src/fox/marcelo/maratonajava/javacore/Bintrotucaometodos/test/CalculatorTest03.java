package fox.marcelo.maratonajava.javacore.Bintrotucaometodos.test;

import fox.marcelo.maratonajava.javacore.Bintrotucaometodos.domain.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {

        //O num1 e num2 não é modificado porque quando se passa tipos primitivos como parâmetros
        // para métodos o que é passado é uma cópia e não a referência em memória.
        Calculator calculator = new Calculator();
        int num1 = 1;
        int num2 = 2;

        calculator.changeTwoNumbers(num1, num2);

        System.out.println("---------------------------------");

        // Por isso que os valores continuam como 1 e 2. Quando o método é chamado ele pega cópias dos
        // valores das variáveis. E não o valor da variável em si.
        System.out.println("Dentro de CalculatorTest03");
        System.out.println("num1 " + num1);
        System.out.println("num2 " + num2);

    }
}
