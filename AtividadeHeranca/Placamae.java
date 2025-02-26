package AtividadeHeranca;

public class Placamae extends Processador{
    
    private String soquete;

    public Placamae(String marca, String modelo, double frequencia, String soquete) {
        super(marca, modelo, frequencia);
        this.soquete = soquete;
    }

    public String getSoquete() {
        return soquete;
    }

    public void setSoquete(String soquete) {
        this.soquete = soquete;
    }

    @Override
    public String toString() {
        return "Placamae [Marca=" + Marca + ", soquete=" + soquete + ", Modelo=" + Modelo + "]";
    }


}
