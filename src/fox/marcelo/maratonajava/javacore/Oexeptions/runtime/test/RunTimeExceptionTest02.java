package fox.marcelo.maratonajava.javacore.Oexeptions.runtime.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {

        try {
            division(1, 0);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("Código Finalizado");

    }

    private static int division(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Não é possível dividir por 0.");
        }
        return a / b;
    }
}
