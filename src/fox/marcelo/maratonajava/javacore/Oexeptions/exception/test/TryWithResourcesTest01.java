package fox.marcelo.maratonajava.javacore.Oexeptions.exception.test;

import fox.marcelo.maratonajava.javacore.Oexeptions.exception.domain.Reader1;
import fox.marcelo.maratonajava.javacore.Oexeptions.exception.domain.Reader2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) throws IOException{
        fileReader();

    }

    public static void fileReader() throws IOException {
        try (Reader1 reader1 = new Reader1();
             Reader2 reader2 = new Reader2()) {

        }
        // Com o try with resources é possível não colocar o catch e lançar a exceção.
        // Muito utilizado para banco de dados onde você tem que fechar a conecção.
    }

    public static void fileReader2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
