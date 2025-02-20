package FuncionarioSexSetor;

public class Funcionario {
    String id;
    String Nome;
    double salario;
    Setor setor;
    Sexo sexo;
    String idade;
    public Funcionario() {
    }
    public Funcionario(String id, String nome, double salario, Setor setor, Sexo sexo, String idade) {
        this.id = id;
        Nome = nome;
        this.salario = salario;
        this.setor = setor;
        this.sexo = sexo;
        this.idade = idade;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public Setor getSetor() {
        return setor;
    }
    public void setSetor(Setor setor) {
        this.setor = setor;
    }
    public Sexo getSexo() {
        return sexo;
    }
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    public String getIdade() {
        return idade;
    }
    public void setIdade(String idade) {
        this.idade = idade;
    }
    
    @Override
    public String toString() {
        return "Funcionario [id=" + id + ", Nome=" + Nome + ", salario=" + salario + ", setor=" + setor + ", sexo="
                + sexo.getTexto() + ", idade=" + idade + "]";
    }

}

