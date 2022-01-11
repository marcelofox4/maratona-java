package fox.marcelo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        //Pode ser inicializado assim também:
//        int numbers[] = new int[] {5, 4, 3, 2};
        int[] numbers = {5, 4, 3, 2};

        //Foreach
        //O array é inteiramente percorrido, mas não é possível acessar os índices.
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
