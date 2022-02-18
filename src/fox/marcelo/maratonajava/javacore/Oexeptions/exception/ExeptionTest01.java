package fox.marcelo.maratonajava.javacore.Oexeptions.exception;

import java.io.File;
import java.io.IOException;

public class ExeptionTest01 {
    public static void main(String[] args) {

        createFile();
    }

    private static void createFile() {
        File file = new File("file\\test.txt");

        //Checked
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado " + isCreated);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
