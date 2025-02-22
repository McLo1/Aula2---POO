package Atividade1;

public class MainMemoriaProcessador {
    public static void main(String[] args) {
        
        Memoria memoria1 = new Memoria("Fury", "HyperX", "2600");
        Processador processador1 = new Processador("ADM", "Ryzen7", 3.6);

        System.out.println(memoria1.toString());
        System.out.println(processador1.toString());

    }
}
