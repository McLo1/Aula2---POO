package Exemplo;

public class MainExemplo {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Marcelo", 18, "27-01-2004", "Débito");
        Funcionario funcionario1 = new Funcionario("Claudio", 21, "l123", "Gerente", 123);
        
        System.out.println(cliente1.toString());
        System.out.println(funcionario1.toString());



    }
}
