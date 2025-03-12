public class Motoboy extends Funcionario{


    public Motoboy(String nome, String cpf, String dataNascimento, double salarioBase) {
        super(nome, cpf, dataNascimento, salarioBase);
    }

    public double ObterSalarioFinal() {
        return this.salarioBase + 1000;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public String toString() {
        return "Nome: " + this.nome + "\nCPF: " + this.cpf + "\nData de Nascimento: " + this.dataNascimento + "\nSalário Base: " + this.salarioBase + "\nSalário Final: " + this.ObterSalarioFinal();
    }


}
