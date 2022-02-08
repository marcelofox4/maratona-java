package fox.marcelo.maratonajava.javacore.Hherança.Test;

import fox.marcelo.maratonajava.javacore.Hherança.domain.Address;
import fox.marcelo.maratonajava.javacore.Hherança.domain.Employee;
import fox.marcelo.maratonajava.javacore.Hherança.domain.Person;

public class TestPenson01 {

    public static void main(String[] args) {
        Address address1 = new Address("Rua 10", "55555-000");

        Person person = new Person("Marcelo");
        person.setCpf("000.123.456.05");
        person.setAddress(address1);
        person.print();

        System.out.println("--------------------------------");

        Employee employee1 = new Employee("Lucas");
        employee1.setCpf("202.525.458.02");
        employee1.setAddress(new Address("Rua 11", "54525-000"));
        employee1.setSalary(3000);
        employee1.print();
        employee1.paymentReport();
    }
}
