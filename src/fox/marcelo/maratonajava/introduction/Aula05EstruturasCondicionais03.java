package fox.marcelo.maratonajava.introduction;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //Operador Ternário -> condição ? true : false
        double salary = 4000;
        String menssageDonate = "Eu vou doar R$ 500,00";
        String menssgeDontDonate = "Não tenho condições";
        String result = salary > 3000 ? menssageDonate : menssgeDontDonate;

        System.out.println(result);
    }
}
