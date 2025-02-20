package enum_sexo;

public enum Estado {    
    BAHIA("Bahia", "Ba"),
    SAO_PAULO("São Paulo", "SP"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ");

    private String texto;
    private String sigla;


    private Estado(String texto, String sigla) {
        this.texto = texto;
        this.sigla = sigla;
    }


    public String getTexto() {
        return texto;
    }


    public void setTexto(String texto) {
        this.texto = texto;
    }


    public String getSigla() {
        return sigla;
    }


    public void setSigla(String sigla) {
        this.sigla = sigla;
    }



}

