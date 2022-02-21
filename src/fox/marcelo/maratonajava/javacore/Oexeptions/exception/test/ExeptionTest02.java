package fox.marcelo.maratonajava.javacore.Oexeptions.exception.test;

import java.io.File;
import java.io.IOException;

public class ExeptionTest02 {
    public static void main(String[] args) throws IOException{

        createFile();
    }

    //Quando lançar a exeção ou tratar no com try catch no método?
    //Se o método for privado é necessário que seja tratado com try catch
    //Se o método for público então lança a exeção.
    private static void createFile() throws IOException{
        File file = new File("file\\test.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado " + isCreated);
        } catch (IOException e) {
            e.printStackTrace();
            // Lançando a execeção no catch
            throw e;
        }
    }
}
