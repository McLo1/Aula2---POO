
import  java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList petsArray = new ArrayList();

        System.out.print("Digite o nome do pet: ");
        String nome = scan.nextLine();

        Pets dog = new Pets("dog", 21, "forte", "Alemão", "Pedigre");

        petsArray.add(dog);


        for (int i = 0; i < petsArray.size(); i++) {
            Pets pet = (Pets) petsArray.get(i);
            System.out.println(pet)
        }

    }
}
