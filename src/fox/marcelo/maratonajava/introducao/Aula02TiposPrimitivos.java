package fox.marcelo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean.
        //Declaração de variável = tipo + nomeDaVariavel + valorDaVariavel.
        int age = 10;
        long bigNumber = 10000;
        double salaryDouble = 2000.0;
        float salaryfloat = 2500.0F;
        byte ageByte = 10;
        short ageShort = 10;
        char caractere = 'M';
        boolean trueFalse = true;

        //Cast = forçar um tipo dentro de um outro tipo que não suporta.
        float salary = (float) 2000D;

        //String Não é um tipo primitivo
        String name = "Marcelo";

        // Concatenação de String com a variável utilizando +
        System.out.println("A idade é " + age + " anos.");
    }
}
