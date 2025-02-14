public class MainExemplo {

    public static void main(String[] args) {
     
        Pessoa pessoa = new Pessoa("Marcelo", 21, "EmailTest@gmai.com");

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

    }

}
