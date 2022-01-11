package fox.marcelo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        //Nos parenteses do if o programa só sera executado se a condição for verdadeira
        int age = 17;
        boolean isAuthorizedBuyAlcohol = age >= 18;
        if (isAuthorizedBuyAlcohol) {
            System.out.println("Autorizado a Comprar bebida alcolica");
        } else {
            System.out.println("NÃO Autorizado a Comprar bebida alcolica");
        }

        if (!isAuthorizedBuyAlcohol) { //isAuthorizedBuyAlcohol == false
            System.out.println("NÃO Autorizado a Compra bebida alcolica");
        } else {
            System.out.println("Autorizado a Comprar bebida alcolica");
        }
    }
}
