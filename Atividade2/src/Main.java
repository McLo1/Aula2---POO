import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Nome do seu pet: ");
        String NomePet = scan.nextLine();

        System.out.println("Digite a idade do seu pet: " );
        int idadePet = scan.nextInt();

        scan.nextLine();

        System.out.println("Qual o porte do seu pet: ");
        String Portepet = scan.nextLine();

        System.out.println("Qual a raça do seu pet?: ");
        String RacaPet = scan.nextLine();

        System.out.println("Qual a alimentação do seu pet?: ");
        String AlimetacaoPet = scan.nextLine();

        Pets pet = new Pets(NomePet, idadePet, Portepet, RacaPet, AlimetacaoPet);

        System.out.println("Pet Criado!\n");
        System.out.println("Nome do pet: " +
        pet.getNome() + "\nIdade do pet: " +
        pet.getIdade() + "\nPorte do seu pet: "+
        pet.getPorte() + "\nRaça do pet: " + 
        pet.getRaca() + "\nAlimentação do seu pet: " +
        pet.getAlimentacao());

        scan.close();


        Scanner scan2 = new Scanner(System.in);

        System.out.println("Nome do seu 2° pet: ");
        NomePet = scan2.nextLine();

        System.out.println("Digite a idade do seu 2° pet: " );
        idadePet = scan2.nextInt();

        scan.nextLine();

        System.out.println("Qual o porte do seu 2° pet: ");
        Portepet = scan2.nextLine();

        System.out.println("Qual a raça do seu 2° pet?: ");
        RacaPet = scan2.nextLine();

        System.out.println("Qual a alimentação do seu 2° pet?: ");
        AlimetacaoPet = scan2.nextLine();

        pet = new Pets(NomePet, idadePet, Portepet, RacaPet, AlimetacaoPet);

        System.out.println("Pet 2 Criado!\n");
        System.out.println("Nome do 2° pet: " +
        pet.getNome() + "\nIdade do 2° pet: " +
        pet.getIdade() + "\nPorte do 2° seu pet: "+
        pet.getPorte() + "\nRaça do 2° pet: " + 
        pet.getRaca() + "\nAlimentação do 2° seu pet: " +
        pet.getAlimentacao());

        scan2.close();


    }
}

//Será?