package fox.marcelo.maratonajava.introducao;

public class Aula06EstruturasDeRepetição02 {
    public static void main(String[] args) {
        //Exercício: Imprima todos os números pares de 0 a 1000.

        for (int i = 0; i <= 1000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
