package PetClass;

public class Pet {
    private String Nome;
    private String idade;
    private String Raca;

    public Pet() {
    }


    public Pet(String nome, String idade, String raca) {
        Nome = nome;
        this.idade = idade;
        Raca = raca;
    }


    public String getNome() {
        return Nome;
    }


 public void setNome(String nome) {
        Nome = nome;
    }
    public String getIdade() {
        return idade;
    }
    public void setIdade(String idade) {
        this.idade = idade;
    }
    public String getRaca() {
        return Raca;
    }
    public void setRaca(String raca) {
        Raca = raca;
    }


    @Override
    public String toString() {
        return "Pet [Nome=" + Nome + ", idade=" + idade + ", Raca=" + Raca + "]";
    }


}
