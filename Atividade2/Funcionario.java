public class Funcionario implements SalarioFinal{

    protected String nome;
    protected String cpf;
    protected String dataNascimento;
    protected double salarioBase;

    public Funcionario(String nome, String cpf, String dataNascimento, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.salarioBase = salarioBase;
    }

    public double ObterSalarioFinal() {
        return this.salarioBase;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String toString() {
        return "Nome: " + this.nome + "\nCPF: " + this.cpf + "\nData de Nascimento: " + this.dataNascimento + "\nSalário Base: " + this.salarioBase;
    }
    

}
