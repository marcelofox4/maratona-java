package fox.marcelo.maratonajava.javacore.Bintrotucaometodos.domain;

public class Person {
    private String name;
    private int age;

    public void print() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public void setNome(String nome) {
        this.name = nome;
    }

    public void setIdade(int idade) {
        this.age = idade;
    }

    public String getNome(){
        return this.name;
    }

    public int getIdade(){
        return this.age;
    }
}
