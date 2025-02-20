package enum_sexo;

public class MainPessoaSexo {
    public static void main(String[] args) {
        
        Pessoa pesssoa1 = new Pessoa("Marcelo", Sexo.MASCULINO, Estado.BAHIA);

        System.out.println(pesssoa1.toString());

    }   
}
