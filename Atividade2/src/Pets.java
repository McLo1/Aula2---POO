public class Pets {

    private String nome;
    private int idade;
    private String raca;
    private String porte;
    private String alimentacao;

    public Pets(String nome, int idade, String porte, String raca, String alimentacao) {
        this.nome = nome;
        this.idade = idade;
        this.porte = porte;
        this.raca = raca;
        this.alimentacao = alimentacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }
}
