package fox.marcelo.maratonajava.javacore.Rdates.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {

        //Calendar é uma classe abstrata não cria um objeto com new;
        Calendar calendar = Calendar.getInstance();

        System.out.println("Dia da semana: " + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("Dia do Mês: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Dia do ano: " + calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("Dia da semana no mês: " + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        //Adicionar dias
        calendar.add(Calendar.DAY_OF_MONTH, 2);

        //Adicionar horas
        calendar.add(Calendar.HOUR, 2);

        Date date = calendar.getTime();
        System.out.println(date);

    }
}
