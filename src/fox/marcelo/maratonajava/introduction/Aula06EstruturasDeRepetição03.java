package fox.marcelo.maratonajava.introduction;

public class Aula06EstruturasDeRepetição03 {
    public static void main(String[] args) {
        // break só funciona dentro de switch ou loop.
        // Imprima os primeiros 25 números de um dado valor. Por exemplo 50.

        int valueMax = 50;
        for (int i = 0; i <= valueMax; i++) {
            System.out.println(i);
            if (i == 25) {
                break;
            }
        }
    }
}
