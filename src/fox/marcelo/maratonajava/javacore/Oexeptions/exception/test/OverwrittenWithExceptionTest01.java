package fox.marcelo.maratonajava.javacore.Oexeptions.exception.test;

import fox.marcelo.maratonajava.javacore.Oexeptions.exception.domain.Employee;
import fox.marcelo.maratonajava.javacore.Oexeptions.exception.domain.InvalidLoginException;
import fox.marcelo.maratonajava.javacore.Oexeptions.exception.domain.Person;

public class OverwrittenWithExceptionTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        Employee employee = new Employee();

        try {
            employee.save();
        } catch (InvalidLoginException e) {
            e.printStackTrace();
        }
    }
}
