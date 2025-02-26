package AtividadeHeranca;

public abstract class Processador {
    
    String Marca;
    String Modelo;
    double frequencia;
    
    public Processador() {
    }

    public Processador(String marca, String modelo, double frequencia) {
        Marca = marca;
        Modelo = modelo;
        this.frequencia = frequencia;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }


    @Override
    public String toString() {
        return "EspTecnicas [Marca=" + Marca + ", Modelo=" + Modelo + ", frequencia=" + "]";
    }
    
}
