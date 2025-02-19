package PetClass;

public class PetCliente {

    public static void main(String[] args) {
        

        ClientePet clientePet = new ClientePet("Laura", "31", 
        new Pet("Lion", "05", "Cachorro"));


        System.out.println(clientePet.toString());
    }

}
