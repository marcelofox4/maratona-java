package fox.marcelo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String name = "Marcelo";
        String nameTwo = "   Marcelo   ";
        String numbers = "012345";

        //.charAt(int index) = retornar o char de acordo com índice.
        System.out.println(name.charAt(0));

        //.length() = retornar o tamanho da String.
        System.out.println(name.length());

        //.replace(String target"", String trocar"")
        System.out.println(name.replace("o", "y"));

        //.toLowerCase() = transformar toda a string em letras minusculas.
        System.out.println(name.toLowerCase());

        //.toUpperCase() = transforma toda a string em letras maisculas.
        System.out.println(name.toUpperCase());

        //.substring(int index onde quer, int index onde termina)
        System.out.println(numbers.substring(0, 3));

        //.trim() = remove os valores em branco que tem no começo e no fim da string.
        System.out.println(nameTwo);
        System.out.println(nameTwo.trim());
    }
}
