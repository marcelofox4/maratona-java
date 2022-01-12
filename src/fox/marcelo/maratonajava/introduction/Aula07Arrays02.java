package fox.marcelo.maratonajava.introduction;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // Valor de inicialização padrão:
        // byte, short, int, long, float, double = 0
        // char = '\u0000' = ' '
        // String = null
        // boolean = false
        String[] names = new String[3];
        names[0] = "Marcelo";
        names[1] = "Marcely";
        names[2] = "Priscilla";

        // Podemos usar uma estrutura de repetição para acessar todos os indices do array.
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
