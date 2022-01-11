package fox.marcelo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {

        int age = 20;
        String category;

        if (age < 15) {
            category = "Categoria Infantil";
        } else if (age >= 15 && age < 18) { // Com o else if() pode-se adicionar mais validações
            category = "Categoria Juvenil";
        } else {
            category = "Categoria Adulto";
        }
        System.out.println(category);
    }
}
