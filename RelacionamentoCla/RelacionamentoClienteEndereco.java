public class RelacionamentoClienteEndereco {
    //Versão 1.0
    public static void main(String[] args) {
        EnderecoRelacionamento enderecoCliente = new EnderecoRelacionamento("Rua a", "N° 200", "Salvador");
        ClienteRelacionamento cliente1 = new ClienteRelacionamento("Marta", "33", enderecoCliente);

        System.out.println(cliente1.toString());

    }
}
