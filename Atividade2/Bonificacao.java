public enum Bonificacao {
    GERENTE(1.3),
    DIRETOR(1.0);

    private final double valor;

    Bonificacao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
