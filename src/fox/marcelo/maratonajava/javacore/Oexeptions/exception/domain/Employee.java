package fox.marcelo.maratonajava.javacore.Oexeptions.exception.domain;

import java.io.FileNotFoundException;

public class Employee extends Person{

    // Quando houver a sobrescrita é possível não coloca nenhuma exceção, apenas uma ou
    // chamar outra exceção que não esteja na assinatura do método. Não pode chamar uma exception
    // mais generica que a da super classe.
    public void save() throws InvalidLoginException{
        System.out.println("Salvando Funcionário");
    }
}
