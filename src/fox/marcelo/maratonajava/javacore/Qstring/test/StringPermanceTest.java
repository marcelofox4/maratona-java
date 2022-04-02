package fox.marcelo.maratonajava.javacore.Qstring.test;

public class StringPermanceTest {
    public static void main(String[] args) {

        long begin = System.currentTimeMillis();
        concatString(30_000);
        long end = System.currentTimeMillis();
        System.out.println("Tempo gasto para o String " + (end - begin) + "ms");

        begin = System.currentTimeMillis();
        concatStringBuilder(30_000);
        end = System.currentTimeMillis();
        System.out.println("Tempo gasto para o concatStringBuilder " + (end - begin) + "ms");

        begin = System.currentTimeMillis();
        concatStringBuffer(30_000);
        end = System.currentTimeMillis();
        System.out.println("Tempo gasto para o concatStringBuffer " + (end - begin) + "ms");
    }

    private static void concatString(int lenghtString) {
        String text = "";
        for (int i = 0; i < lenghtString; i++) {
            text += i;
        }
    }

    private static void concatStringBuilder(int lenghtString) {
        StringBuilder stringBuilder = new StringBuilder(lenghtString);
        for (int i = 0; i < lenghtString; i++) {
            stringBuilder.append(i);
        }
    }

    private static void concatStringBuffer(int lenghtString) {
        StringBuffer stringBuffer = new StringBuffer(lenghtString);
        for (int i = 0; i < lenghtString; i++) {
            stringBuffer.append(i);
        }
    }
}
