public class Gerente extends CargoDeConfianca implements Contratacao{

	
	public Gerente(String nome, String cpf, String dataNascimento, double salarioBase, Bonificacao bonificacao) {
		super(nome, cpf, dataNascimento, salarioBase, bonificacao);
	}
	
	@Override
	public double ObterSalarioFinal() {
		return this.salarioBase + this.bonificacao.getValor();
	}


	@Override
	public void Contratar(Funcionario funcionario) {
		System.out.println("Contratando funcionário: " + funcionario.getNome());
    }
	
	@Override
	public void Demitir(Funcionario funcionario) {
		System.out.println("Demitindo funcionário: " + funcionario.getNome());
    }
	
	@Override
	public String toString() {
		return "Gerente{" +
				"nome='" + nome + '\'' +
				", cpf='" + cpf + '\'' +
				", dataNascimento='" + dataNascimento + '\'' +
				", salarioBase=" + salarioBase +
				", bonificacao=" + bonificacao +
				'}';
	}
}
