public abstract class CargoDeConfianca extends Funcionario{


    protected Bonificacao bonificacao;


    

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

    @Override
    public String toString() {
        return "CargoDeConfianca{" +
                "bonificacao=" + bonificacao +
                '}';
    }

}
