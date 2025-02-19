package PetClass;

public class ClientePet {

    private String Nome;
    private String idade;
    private Pet pet;


    public ClientePet() {
    }

    public ClientePet(String nome, String idade, Pet pet) {
        Nome = nome;
        this.idade = idade;
        this.pet = pet;
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
    public Pet getPet() {
        return pet;
    }
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "ClientePet [Nome=" + Nome + ", idade=" + idade + ", pet=" + pet + "]";
    }


}
