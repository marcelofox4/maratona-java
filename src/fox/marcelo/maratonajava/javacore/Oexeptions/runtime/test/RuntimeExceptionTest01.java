package fox.marcelo.maratonajava.javacore.Oexeptions.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        // Checked = Filhas DIRETAS da classe Exception. Se não tratadas vão lançar erros em tempo de compilação.
        // Unchecked = Filhas DIRETAS de RuntimeException. Podem ser lançadas pelo Java ou nós podemos criar nossas
        // próprias exeções. NÃO é obrigatório o tratamento.

        // Unchecked
        int[] nums = {1, 2};
        System.out.println(nums[2]);
    }
}
