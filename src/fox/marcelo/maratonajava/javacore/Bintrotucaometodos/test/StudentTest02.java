package fox.marcelo.maratonajava.javacore.Bintrotucaometodos.test;

import fox.marcelo.maratonajava.javacore.Bintrotucaometodos.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();

        student01.nome = "Marcelo";
        student01.idade = 30;
        student01.sexo = 'M';

        student02.nome = "Priscilla";
        student02.idade = 28;
        student02.sexo = 'F';

        student01.print();
        student02.print();
    }
}
