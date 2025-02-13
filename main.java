public class main {

    public static void main(String[] args) {
     
        Pessoa pessoa = new Pessoa();

        // pessoa.nome = "Marta";
        // pessoa.idade = 21;

        // System.out.println("Nome: " + pessoa.nome);
        // System.out.println("Idade: " + pessoa.idade);
        

        pessoa.setNome("Kleithon");
        pessoa.setIdade(21);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

    }

}
