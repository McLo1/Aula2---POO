package Banco;

public class ContaBancFuncionario {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("005", "Marcelo", "Rua rio Serrano", "71987230053", "Marcelo.ferreira@gmail.com", 
        new ContaBancaria("Bradesco", "3108", "00054354564", "Poupanca", "R$ 15.000", "R$ 12.000"));


        System.out.println(funcionario.toString());
        
    }
}
