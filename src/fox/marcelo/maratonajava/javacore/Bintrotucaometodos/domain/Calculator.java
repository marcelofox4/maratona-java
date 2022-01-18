package fox.marcelo.maratonajava.javacore.Bintrotucaometodos.domain;

public class Calculator {

    //Métodos sem retorno(void)
    public void somTwoNumbers(double num1, double num2) {
        System.out.println(num1 + num2);
    }

    public void subtractTwoNumbers(double num1, double num2) {
        System.out.println(num1 + num2);
    }

    public void multipliesTwoNumbers(double num1, double num2) {
        System.out.println(num1 * num2);
    }

    //Método onde existe retorno e é double
    public double dividedTwoNumbers(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por zero");
            return 0;
        }
        return num1 / num2;
    }

    public void changeTwoNumbers(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro de changeTwoNumbers");
        System.out.println("num1 " + num1);
        System.out.println("num2 " + num2);
    }

    public void sumArray(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }

    //VarArgs é representado pelos (...) e funciona como um array.
    public void sumVarArgs(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }
}
