package fox.marcelo.maratonajava.javacore.Oexeptions.exception.test;

import fox.marcelo.maratonajava.javacore.Oexeptions.exception.domain.InvalidLoginException;

import java.util.Scanner;

public class InvalidLoginTes01 {
    public static void main(String[] args) {

        try {
            Logar();
        } catch (InvalidLoginException e) {
            e.printStackTrace();
        }

    }

    private static void Logar() throws InvalidLoginException{
        Scanner scanner = new Scanner(System.in);

        String userNameDB = "Marcelo";
        String passWord = "123";

        System.out.println("Usuário");
        String userNameWritten = scanner.nextLine();
        System.out.println("Senha");
        String passWordWritten = scanner.nextLine();

        boolean isValidationLogin = !userNameDB.equals(userNameWritten) || !passWord.equals(passWordWritten);
        if (isValidationLogin) {
            throw new InvalidLoginException("Usuário ou senha inválidos");
        }

        System.out.println("Usuário Logado com sucesso");
    }
}
