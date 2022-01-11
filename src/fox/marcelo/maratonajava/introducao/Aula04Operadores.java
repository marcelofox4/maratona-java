package fox.marcelo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        //Operadores Aritméticos +(soma), -(subtração), *(multiplicação), /(divisão).
        int number1 = 20;
        int number2 = 10;
        int sum = number1 + number2;
        int subtraction = number1 - number2;
        int multiplication = number1 * number2;
        int division = number1 / number2;
        System.out.println(sum);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);

        //Operador (+) é sobregarregado ele se comporta de maneiras diferentes. Concatenar ou Somar
        //Dependera da sequência que for inserido
        System.out.println("Soma " + number1 + number2); //Console -> Número 2010
        System.out.println(number1 + number2 + "Número " + number1 + number2); //Console -> 30Número 2010

        //Operador de Resto % (retorna o resto da divisão).
        int resto = 20 % 10;
        System.out.println(resto); //Console -> 0

        //Operadores Relacionais <(menor), >(maior), <=(menor igual), >=(maior igual), ==(igual), !=(diferente)
        //Retornará um booleano true ou false.
        boolean isTenLessThanTwenty = 10 < 20;
        boolean isTenBiggerThenTwenty= 10 > 20;
        boolean isTenEqualTwenty = 10 == 20;
        boolean isTenDifferentTwenty = 10 != 20;
        System.out.println("isTenLessThanTwenty " + isTenLessThanTwenty);
        System.out.println("isTenBiggerThenTwenty " + isTenBiggerThenTwenty);
        System.out.println("isTenEqualTwenty " + isTenEqualTwenty);
        System.out.println("isTenDifferentTwenty " + isTenDifferentTwenty);

        //Operadores Lógicos &&(AND), ||(OR), !(Negação)
        int age = 29;
        float salary = 3500F;
        boolean isWithinTheLawBiggerThenThirty = age > 30 && salary >= 4612;
        boolean isWithinTheLawLessThanThirty = age < 30 && salary >= 3381;
        System.out.println("isWithinTheLawBiggerThenThirty " + isWithinTheLawBiggerThenThirty);
        System.out.println("isWithinTheLawLessThanThirty " + isWithinTheLawLessThanThirty);

        double totalValueCheckingAccount = 200;
        double totalValueSavingsAccount = 10000;
        float totalPlaystationCinco = 5000;
        boolean isPlaystationCincoPurchase= totalValueCheckingAccount >= totalPlaystationCinco || totalValueSavingsAccount >= totalPlaystationCinco;
        System.out.println("isPlaystationCincoPurchase " + isPlaystationCincoPurchase);

        //Operadores de Atribuição =, +=, -=, *=, /=
        double bonus = 2000;
        bonus += 1000; // bonus = bonus + 1000
        System.out.println("bonus " + bonus); //Console -> 3000

        // ++, --
        int counter = 0;
        counter++; //Executa depois adiciona
        counter--;
        ++counter; //Adiciona depois executa
        --counter;
        System.out.println("counter " + counter);
    }
}
