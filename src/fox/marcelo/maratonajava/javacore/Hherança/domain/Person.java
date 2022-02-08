package fox.marcelo.maratonajava.javacore.Hherança.domain;

public class Person {

    //Modificador de acesso protected vai dar acesso a todas as subclasses que estendem de Person
    //e que estão no mesmo pacote.
    protected String name;
    protected String cpf;
    protected Address address;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String cpf) {
        this(name);
        this.cpf = cpf;
    }

    public void print() {
        System.out.println("Nome: " + this.name);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereço: " + this.address.getStreet() + " - " + this.address.getCep());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
