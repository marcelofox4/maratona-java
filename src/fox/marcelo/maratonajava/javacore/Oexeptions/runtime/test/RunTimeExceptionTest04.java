package fox.marcelo.maratonajava.javacore.Oexeptions.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RunTimeExceptionTest04 {
    public static void main(String[] args) {

        // Capturando multiplas exceções.

        // Sempre colocar as exceções mais específicas primeiro.
        try {
            throw new IllegalArgumentException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro IllegalArgumentException");
        } catch (RuntimeException e) {
            System.out.println("Dentro RuntimeException");
        }
        // A exceção mais genêrica no final.


        // É possível usar o catch dessa forma quando as exceções não estiverem na mesma
        // linha de herança.
        try {
            maybeThrowException();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void maybeThrowException() throws SQLException, FileNotFoundException {

    }
}
