package fox.marcelo.maratonajava.javacore.Oexeptions.exception.domain;

import java.io.Closeable;
import java.io.IOException;

public class Reader1 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Fechando conexão do Reader 1");
    }
}
