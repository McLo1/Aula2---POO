public class MainAtividade2 {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("João", "123456789-00", "01/01/2000", 5000, Bonificacao.DIRETOR);
        Funcionario funcionario = new Funcionario("Maria", "987654321-00", "01/01/2000", 3000);

        System.out.println(gerente);
        System.out.println("Salário final do gerente: " + gerente.ObterSalarioFinal());
        System.out.println(funcionario);
        System.out.println("Salário final do funcionário: " + funcionario.ObterSalarioFinal());

        gerente.Contratar(funcionario);
        gerente.Demitir(funcionario);

    }

}
