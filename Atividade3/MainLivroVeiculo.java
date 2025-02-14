package Atividade3;
import java.util.*;

public class MainLivroVeiculo {
    public static void main(String[] args) {
    
        // Criação do Livro

        Scanner scan = new Scanner(System.in);

        System.out.println("Titulo do Livro: ");
        String TituloLivro = scan.nextLine();

        System.out.println("Autor do livro: " );
        String AutorLivro = scan.nextLine();

        System.out.println("ISBN do livro: ");
        String ISBNLivro = scan.nextLine();

        System.out.println("Número de paginas do livro?: ");
        int NumerodePaginasLivro = scan.nextInt();

        System.out.println("Valor da Compra do seu livro: ");
        double ValordeCompraLivro = scan.nextDouble();

        Livro livro = new Livro(TituloLivro, AutorLivro, ISBNLivro, NumerodePaginasLivro, ValordeCompraLivro);



        System.out.println("Nome do livro: " +
        livro.getTitulo() + "\nAutor do livro: " +
        livro.getAutor() + "\nISBN do seu livro: "+
        livro.getISBN() + "\nNúmero de paginas do livro: " + 
        livro.getNumerodePaginas() + "\nValor de Compra do livro: " +
        livro.getValorCompra());

        System.out.println("Livro Criado!\n\n\n\n");

        //Criação do veiculo

        Scanner scan2 = new Scanner(System.in);

        System.out.println("Digite a placa do seu veiculo: ");
        String PlacaVeiculo = scan2.nextLine();

        System.out.println("Digite a cor do seu veiculo: " );
        String CorVeiculo = scan2.nextLine();

        System.out.println("Digite o número de passageiros que o seu veiculo comporta: ");
        int numerodePassageiros = scan2.nextInt();

        scan2.nextLine();

        System.out.println("Digite a capacidade do tanque do seu veiculo: ");
        String capacidadeTanqueVeiculo = scan2.nextLine();

        System.out.println("Qual a velocidade máxima do seu veiculo: ");
        double velocidadeMaximaVeiculo = scan2.nextDouble();

        Veiculo veiculo = new Veiculo(PlacaVeiculo, CorVeiculo, numerodePassageiros, capacidadeTanqueVeiculo, velocidadeMaximaVeiculo, velocidadeMaximaVeiculo);

        System.out.println("Veiculo Criado!\n");
        System.out.println("Placa do veiculo: " +
        veiculo.getPlaca() + "\nCor do veiculo: " +
        veiculo.getCor() + "\nNumero de passageiros que o veiculo comporta: "+
        veiculo.getNumeroPassageiros() + "\nCapacidade do tanque do veiculo: " + 
        veiculo.getCapacidadeTanque() + "\nVelocidade máxima do veiculo: " +
        veiculo.getVelocidadeMaxima());

        System.out.println("Veiculo Criado!\n\n\n\n");

        scan.close();
        scan2.close();


    }
}
