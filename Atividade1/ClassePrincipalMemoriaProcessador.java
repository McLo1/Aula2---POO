package Atividade1;

public abstract class ClassePrincipalMemoriaProcessador {
    protected String Marca;
    protected String Modelo;
    
    public ClassePrincipalMemoriaProcessador() {
    }

    public ClassePrincipalMemoriaProcessador(String marca, String modelo) {
        Marca = marca;
        Modelo = modelo;
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

    @Override
    public String toString() {
        return "ClassePrincipalMemoriaProcessador [Marca=" + Marca + ", Modelo=" + Modelo + "]";
    }
    
    

}
