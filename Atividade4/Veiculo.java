package Atividade4;

public class Veiculo {

    private String Placa;
    private String cor;
    private int NumeroPassageiros;
    private String CapacidadeTanque;
    private double VelocidadeMaxima;
    private double ConsumoMedio;

    public Veiculo(String placa, String cor, int numeroPassageiros, String capacidadeTanque, double velocidadeMaxima,
            double consumoMedio) {
        Placa = placa;
        this.cor = cor;
        NumeroPassageiros = numeroPassageiros;
        CapacidadeTanque = capacidadeTanque;
        VelocidadeMaxima = velocidadeMaxima;
        ConsumoMedio = consumoMedio;
    }

    
    public String getPlaca() {
        return Placa;
    }
    public void setPlaca(String placa) {
        Placa = placa;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getNumeroPassageiros() {
        return NumeroPassageiros;
    }
    public void setNumeroPassageiros(int numeroPassageiros) {
        NumeroPassageiros = numeroPassageiros;
    }
    public String getCapacidadeTanque() {
        return CapacidadeTanque;
    }
    public void setCapacidadeTanque(String capacidadeTanque) {
        CapacidadeTanque = capacidadeTanque;
    }
    public double getVelocidadeMaxima() {
        return VelocidadeMaxima;
    }
    public void setVelocidadeMaxima(double velocidadeMaxima) {
        VelocidadeMaxima = velocidadeMaxima;
    }
    public double getConsumoMedio() {
        return ConsumoMedio;
    }
    public void setConsumoMedio(double consumoMedio) {
        ConsumoMedio = consumoMedio;
    }


    

}
