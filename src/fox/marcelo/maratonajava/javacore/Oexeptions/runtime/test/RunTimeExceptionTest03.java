package fox.marcelo.maratonajava.javacore.Oexeptions.runtime.test;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) {

        connectionOpen();
    }

    private static String connectionOpen() {
        // O finally sempre será executado

        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta";
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }
}
