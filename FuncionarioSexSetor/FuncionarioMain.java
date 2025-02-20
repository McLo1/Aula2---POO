package FuncionarioSexSetor;

public class FuncionarioMain {
    public static void main(String[] args) {
        
        Funcionario funcionario1 = new Funcionario("007", "MarceloFerreira", 1.518, Setor.FINANCEIRO, Sexo.MASCULINO, "18");

        System.out.println(funcionario1.toString());

    }
}
