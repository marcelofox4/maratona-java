package fox.marcelo.maratonajava.javacore.Bintrotucaometodos.test;

import fox.marcelo.maratonajava.javacore.Bintrotucaometodos.domain.Student;
import fox.marcelo.maratonajava.javacore.Bintrotucaometodos.domain.printerStudents;

public class StudentTest01 {
    public static void main(String[] args) {
        //Quando se passa Objetos(tipo reference)como parâmetro para metódos
        //se está na verdade passando o próprio objeto. Diferente de quando é do tipo primitivo.
        Student student01 = new Student();
        Student student02 = new Student();
        printerStudents printerStudents = new printerStudents();

        student01.nome = "Marcelo";
        student01.idade = 30;
        student01.sexo = 'M';

        student02.nome = "Priscilla";
        student02.idade = 28;
        student02.sexo = 'F';

        printerStudents.printStudents(student01);
        System.out.println("---------------------------");
        printerStudents.printStudents(student02);
    }
}
