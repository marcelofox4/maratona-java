package fox.marcelo.maratonajava.introduction;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int[][] ages = new int[3][3];

        ages[0][0] = 10;
        ages[0][1] = 20;
        ages[0][2] = 30;

        ages[1][0] = 40;
        ages[1][1] = 50;
        ages[1][2] = 60;

        ages[2][0] = 70;
        ages[2][1] = 80;
        ages[2][2] = 90;

        for (int i = 0; i < ages.length; i++) {
            for (int j = 0; j < ages[i].length; j++) {
                System.out.println(ages[i][j]);
            }
        }

        System.out.println("-----------------------------");

        for (int[] arrBase: ages){
            for (int num: arrBase){
                System.out.println(num);
            }
        }
    }
}
