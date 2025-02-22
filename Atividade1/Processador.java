package Atividade1;

public class Processador extends ClassePrincipalMemoriaProcessador{

    double CapacidadeDearmazenamento;

    public Processador(String marca, String modelo, double capacidadeDearmazenamento) {
        super(marca, modelo);
        CapacidadeDearmazenamento = capacidadeDearmazenamento;
    }

    public double getCapacidadeDearmazenamento() {
        return CapacidadeDearmazenamento;
    }

    public void setCapacidadeDearmazenamento(double capacidadeDearmazenamento) {
        CapacidadeDearmazenamento = capacidadeDearmazenamento;
    }

    @Override
    public String toString() {
        return "Processador [Marca=" + Marca + ", CapacidadeDearmazenamento=" + CapacidadeDearmazenamento + ", Modelo="
                + Modelo + "]";
    }

  

}   
