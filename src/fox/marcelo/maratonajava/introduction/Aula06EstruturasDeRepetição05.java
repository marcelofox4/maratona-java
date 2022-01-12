package fox.marcelo.maratonajava.introduction;

public class Aula06EstruturasDeRepetição05 {
    public static void main(String[] args) {
        //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado.
        //Condição valor da parcela seja 1000.

        double carPrice = 30000;
        for (int portion = (int) carPrice; portion >= 1; portion--) {
            double valorParcela = carPrice / portion;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela " + portion + " R$: " + valorParcela);
        }
    }
}

