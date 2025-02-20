package Banco;

public class Funcionario {

    String CodigoFuncionario;
    String Nome;
    String Endereco;
    String Telefone;
    String Email;
    ContaBancaria contaBancaria;
    
    public Funcionario() {
    }

    public Funcionario(String codigoFuncionario, String nome, String endereco, String telefone, String email,
            ContaBancaria contaBancaria) {
        CodigoFuncionario = codigoFuncionario;
        Nome = nome;
        Endereco = endereco;
        Telefone = telefone;
        Email = email;
        this.contaBancaria = contaBancaria;
    }

    public String getCodigoFuncionario() {
        return CodigoFuncionario;
    }

    public void setCodigoFuncionario(String codigoFuncionario) {
        CodigoFuncionario = codigoFuncionario;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public ContaBancaria getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(ContaBancaria contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    @Override
    public String toString() {
        return "Funcionario [CodigoFuncionario=" + CodigoFuncionario + ", Nome=" + Nome + ", Endereco=" + Endereco
                + ", Telefone=" + Telefone + ", Email=" + Email + ", contaBancaria=" + contaBancaria + "]";
    }



}

