package fox.marcelo.maratonajava.javacore.Gassociacao.test;

import fox.marcelo.maratonajava.javacore.Gassociacao.domain.School;
import fox.marcelo.maratonajava.javacore.Gassociacao.domain.Teacher;

public class SchoolTest01 {
    public static void main(String[] args) {

        // Teachers N -- 1 School = Associação Unidirecional
        Teacher teacher1 = new Teacher("Marcelo");
        Teacher teacher2 = new Teacher("Priscilla");
        Teacher[] teachers = new Teacher[]{teacher1, teacher2};

        School school = new School("Saber Infinito", teachers);

        school.print();
    }
}
