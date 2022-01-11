package fox.marcelo.maratonajava.introducao;

/*
* Prática
*
* Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
* Eu <nome>, morando no endereço <endereço>,
* confirmo que recebi o salário de <salario>, na data <data>
* */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String name = "Marcelo";
        String adress = "Rua do Estaleiro";
        float salary = 2500.50F;
        String date = "15/12/2021";

        System.out.println("Eu "+name+", morando no endereço "+adress+", confirmo que recebi o salário de "+salary+", na data "+date+".");
    }
}
