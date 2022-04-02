package fox.marcelo.maratonajava.javacore.Rdates.test;

import java.util.Date;

public class DateTeste01 {
    public static void main(String[] args) {

        //Ainda usado em sistemas legados.
        //Representa um long de milisegundos.
        //Maioria dos métodos estão obsoletos.
        Date date = new Date(1648929092029L);
        System.out.println(date);

    }
}
