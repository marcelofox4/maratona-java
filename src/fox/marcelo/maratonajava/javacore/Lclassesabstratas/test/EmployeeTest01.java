package fox.marcelo.maratonajava.javacore.Lclassesabstratas.test;

import fox.marcelo.maratonajava.javacore.Lclassesabstratas.domain.Developer;
import fox.marcelo.maratonajava.javacore.Lclassesabstratas.domain.Manager;

public class EmployeeTest01 {
    public static void main(String[] args) {

        Manager manager01 = new Manager("Priscilla", 5000);
        Developer developer01 = new Developer("Marcelo", 7000);

        System.out.println(manager01);
        System.out.println(developer01);

        manager01.print();
        developer01.print();
    }
}
