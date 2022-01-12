package fox.marcelo.maratonajava.introduction;

public class Aula06EstruturasDeRepetição04 {
    public static void main(String[] args) {
        //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado.
        //Condição valor da parcela seja 1000.

        double carPrice = 30000;
        for (int portion = 1; portion <= carPrice; portion++) {
            double valorParcela = carPrice / portion;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + portion + " R$: " + valorParcela);
        }
    }
}

