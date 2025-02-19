public class ClienteRelacionamento {

    private String nome;
    private String idade;
    private EnderecoRelacionamento EnderecoCliente;
    
    public ClienteRelacionamento() {
    }

    public ClienteRelacionamento(String nome, String idade, EnderecoRelacionamento enderecoCliente) {
        this.nome = nome;
        this.idade = idade;
        EnderecoCliente = enderecoCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public EnderecoRelacionamento getEnderecoCliente() {
        return EnderecoCliente;
    }

    public void setEnderecoCliente(EnderecoRelacionamento enderecoCliente) {
        EnderecoCliente = enderecoCliente;
    }

    @Override
    public String toString() {
        return "ClienteRelacionamento [nome=" + nome + ", idade=" + idade + ", EnderecoCliente=" + EnderecoCliente
                + "]";
    }



}



