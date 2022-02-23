package fox.marcelo.maratonajava.javacore.Oexeptions.exception.domain;

public class InvalidLoginException extends Exception{
    public InvalidLoginException() {
        super("Login Inválido");
    }

    public InvalidLoginException(String message) {
        super(message);
    }
}
