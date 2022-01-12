package fox.marcelo.maratonajava.introduction;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        //Arrays são do tipo reference
        //Quando inicializado é necessário inserir o tamnaho
        //O tamanho do array não pode ser alterado dinamicamente
        int[] ages = new int[3];
        ages[0] = 21;
        ages[1] = 31;
        ages[2] = 11;
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
    }
}
