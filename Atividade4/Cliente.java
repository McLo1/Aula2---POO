package Atividade4;

public class Cliente {

    private String Nome;
    private int idade;
    private String CPF;
    private String Endereco;
    private int Telefone;


    public Cliente(String nome, int idade, String cPF, String endereco, int telefone) {
    Nome = nome;
    this.idade = idade;
    CPF = cPF;
    Endereco = endereco;
    Telefone = telefone;
}
    
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public String getEndereco() {
        return Endereco;
    }
    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public int getTelefone() {
        return Telefone;
    }
    public void setTelefone(int telefone) {
        Telefone = telefone;
    }

    

}
