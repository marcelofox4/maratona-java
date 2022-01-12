package fox.marcelo.maratonajava.javacore.Aintroducaoclasses.test;

import fox.marcelo.maratonajava.javacore.Aintroducaoclasses.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        //Objeto estanciado atravéz da Classe Student
        Student student = new Student();

        //Acessa os atributos atravéz da variável de referência student
        student.name = "Marcelo";
        student.age = 30;
        student.sex = 'M';

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sex);
    }
}
