package fox.marcelo.maratonajava.exercises.seminars.test;

/*Crie um Sistema que gerencie seminários.

O sistema deverá cadastrar seminários, estudantes, professores e local onde será realizado.

- Um aluno poderá estar em apenas um seminário;
- Um seminário poderá ter nenhum ou vários alunos;
- Um professor poderá estar em vários seminários;
- Um seminário deve ter um local;

Campos Básicos (excluindo relacionamentos):
- seminário: título;
- aluno: nome e idade;
- professor: nome, especialidade;
- local - endereço.*/


import fox.marcelo.maratonajava.exercises.seminars.domain.Place;
import fox.marcelo.maratonajava.exercises.seminars.domain.Professor;
import fox.marcelo.maratonajava.exercises.seminars.domain.Seminar;
import fox.marcelo.maratonajava.exercises.seminars.domain.Student;

public class SeminarsTest {
    public static void main(String[] args) {

        Place place1 = new Place("Rua Joaquim Borba, n° 420");
        Place place2 = new Place("Rua Diagonal, n° 20");
        Place place3 = new Place("Av. Tavares Raposo, n° 513");

        Seminar seminar1 = new Seminar("Java Orientado a Objetos", place1);
        Seminar seminar2 = new Seminar("Estrutura de Dados", place2);
        Seminar seminar3 = new Seminar("O Futuro do Desenvolvimento de Software", place3);
        Seminar[] seminars1 = new Seminar[]{seminar1, seminar2};
        Seminar[] seminars2 = new Seminar[]{seminar3};

        Professor professor1 = new Professor("Rodrigo Cavalcante", "Linguagem Java", seminars1);
        Professor professor2 = new Professor("Taylor Spring", "Desenvolvimento Mobile", seminars2);

        Student student1 = new Student("Marcelo Sodré", 30, seminar1);
        Student student2 = new Student("Pricilla Tavares", 28, seminar3);
        Student student3 = new Student("Marcely Pereira", 19, seminar3);
        Student student4 = new Student("Matheus Correia", 28, seminar2);
        Student student5 = new Student("Vania da Mota", 45, seminar2);
        Student student6 = new Student("Isabella Tavares Raposo", 17, seminar1);

        Student[] students1 = new Student[]{student1, student6};
        Student[] students2 = new Student[]{student4, student5};
        Student[] students3 = new Student[]{student2, student3};

        seminar1.setStudents(students1);
        seminar2.setStudents(students2);
        seminar3.setStudents(students3);

        seminar1.print();
        seminar2.print();
        seminar3.print();

        System.out.println("**************************");

        professor1.print();
        professor2.print();
    }
}
