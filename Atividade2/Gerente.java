public class Gerente extends CargoDeConfianca implements Contratacao{

    

	@Override
	public void Contratar(Funcionario funcionario) {
        System.out.println("Contratando funcionário: " + funcionario.getNome());
    }

	@Override
	public void Demitir(Funcionario funcionario) {
        System.out.println("Demitindo funcionário: " + funcionario.getNome());
    }
}
