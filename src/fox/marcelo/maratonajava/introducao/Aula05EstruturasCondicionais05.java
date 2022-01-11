package fox.marcelo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {

        double salario = 5000.98;
        if (salario <= 1903.98) {
            System.out.println("Não paga Imposto de Renda");
        } else if (salario >= 1903.99 && salario <= 2826.65) {
            System.out.println("Vai pagar 7,5% de Imposto de Renda");
        } else if (salario >= 2826.66 && salario <= 3751.05) {
            System.out.println("Vai pagar 15% de Imposto de Renda");
        } else if (salario >= 3751.06 && salario <= 4664.68) {
            System.out.println("Vai pagar 22,5% de Imposto de Renda");
        } else {
            System.out.println("Vai pagar 27,5% de Imposto de Renda");
        }
    }
}
