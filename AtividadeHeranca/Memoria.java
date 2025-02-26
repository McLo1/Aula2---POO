package AtividadeHeranca;

public class Memoria extends Processador{

    private String CapacidadeDeArmazenamento;

    public Memoria(String marca, String modelo, double frequencia, String capacidadeDeArmazenamento) {
        super(marca, modelo, frequencia);
        CapacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    public String getCapacidadeDeArmazenamento() {
        return CapacidadeDeArmazenamento;
    }

    public void setCapacidadeDeArmazenamento(String capacidadeDeArmazenamento) {
        CapacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    @Override
    public String toString() {
        return "Memoria [Marca=" + Marca + ", CapacidadeDeArmazenamento=" + CapacidadeDeArmazenamento + ", Modelo="
                + Modelo + ", frequencia=" + frequencia + "]";
    }

}
