import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o titulo do livro que deseja criar: ");
        String TitulosetLivro = scan.nextLine();

        System.out.println("Digite o nome do autor: " );
        String AutorLivro = scan.nextLine();

        System.out.println("Quantas paginas terá o livro?: ");
        int numeropaginas = scan.nextInt();

        System.out.println("Por quanto você vai vender o livro?: ");
        double PrecoLivro = scan.nextDouble();

       MainLivro livro = new MainLivro(TitulosetLivro, AutorLivro, numeropaginas, PrecoLivro);     

        System.out.println("Livro Criado!\n");
        System.out.println("Nome do livro: " +
        livro.getTitulo() + "\nNome do Autor: " +
        livro.getAutor() + "\nNumero de paginas do livro: "+
        livro.getNumPaginas() + "\nPreço do livro: " + livro.getPreco());


    }
}
