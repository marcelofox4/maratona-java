package fox.marcelo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        //Exercício de switch: dado os valores de 1 a 7, imprima se é dia útil
        //ou final de semana. Considerando 1 como Domingo.

        byte day = 1;
        switch (day) {
            case 1:
                System.out.println("Domingo - FERIADO");
                break;
            case 2:
                System.out.println("Segunda - DIA ÚTIL");
                break;
            case 3:
                System.out.println("Terça - DIA ÚTIL");
                break;
            case 4:
                System.out.println("Quarta - DIA ÚTIL");
                break;
            case 5:
                System.out.println("Quinta - DIA ÚTIL");
                break;
            case 6:
                System.out.println("Sexta - DIA ÚTIL");
                break;
            case 7:
                System.out.println("Sábado - FERIADO");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
