package fox.marcelo.maratonajava.introducao;

public class Aula06EstruturasDeRepetição01 {
    public static void main(String[] args) {
        //while, do while, for
        //Executam o programa enquanto a condição dos parênteses for true.
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count++;
        }

        //do while executa a iteração pelo menos uma vez antes de fazer a validação
        do {
            System.out.println("Dentro -> Do While " + count);
            count++;
        } while (count < 20);

        for (int i = 0; i < 10; i++) {
            System.out.println("for = " + i);
        }
    }

}
