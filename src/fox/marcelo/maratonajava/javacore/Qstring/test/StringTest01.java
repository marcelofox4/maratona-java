package fox.marcelo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        //As Strings são imutáveis.
        String name = "Marcelo"; //String constant pool
        String nameTwo = "Marcelo";

        //Cria-se uma nova string no pool, mas não concatena, pois as Strings são imutaveis.
        nameTwo.concat(" Sodré");

        //Estão fazendo referência para a mesma string no pool de strings.
        System.out.println(name == nameTwo);

        //É neccessário fazer uma nova atribuição para a concatenação, dessa forma cria-se
        //essa nova string no pool
        name = name.concat(" Sodré");

        System.out.println(name == nameTwo);
    }
}
