package Atividade4;
import java.util.*;


public class MainVeiculoCliente {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a placa do seu veiculo: ");
        String PlacaVeiculo = scan.nextLine();

        System.out.println("Digite a cor do seu veiculo: " );
        String CorVeiculo = scan.nextLine();

        System.out.println("Digite o número de passageiros que o seu veiculo comporta: ");
        int numerodePassageiros = scan.nextInt();

        scan.nextLine();

        System.out.println("Digite a capacidade do tanque do seu veiculo: ");
        String capacidadeTanqueVeiculo = scan.nextLine();

        System.out.println("Qual a velocidade máxima do seu veiculo: ");
        double velocidadeMaximaVeiculo = scan.nextDouble();

        Veiculo veiculo = new Veiculo(PlacaVeiculo, CorVeiculo, numerodePassageiros, capacidadeTanqueVeiculo, velocidadeMaximaVeiculo, velocidadeMaximaVeiculo);

        System.out.println("Veiculo Criado!\n");
        System.out.println("Placa do veiculo: " +
        veiculo.getPlaca() + "\nCor do veiculo: " +
        veiculo.getCor() + "\nNumero de passageiros que o veiculo comporta: "+
        veiculo.getNumeroPassageiros() + "\nCapacidade do tanque do veiculo: " + 
        veiculo.getCapacidadeTanque() + "\nVelocidade máxima do veiculo: " +
        veiculo.getVelocidadeMaxima());

        System.out.println("Veiculo Criado!\n\n\n\n");







        System.out.println("Digite o seu nome: ");
        String NomeCliente = scan.nextLine();

        scan.nextLine();

        System.out.println("Digite a sua idade: " );
        int IdadeCliente = scan.nextInt();

        scan.nextLine();

        System.out.println("Digite o seu CPF: ");
        String CPFCliente = scan.nextLine();

        System.out.println("Digite o Endereço do cliente: ");
        String EnderecoCliente = scan.nextLine();

        System.out.println("Digite o seu telefone: ");
        int TelefoneCliente = scan.nextInt();


        Cliente cliente = new Cliente(NomeCliente, IdadeCliente, CPFCliente, EnderecoCliente, TelefoneCliente);

        System.out.println("Nome do Cliente " +
        cliente.getNome() + "\nIdade do cliente " +
        cliente.getIdade() + "\nCPF do cliente: "+
        cliente.getCPF() + "\nEndereço do Cliente: " + 
        cliente.getEndereco() + "\nTelefone do Cliente: " +
        cliente.getTelefone());

        System.out.println("Cliente Criado!");


        scan.close();


    }

}
