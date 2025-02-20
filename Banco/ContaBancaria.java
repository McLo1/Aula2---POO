package Banco;

public class ContaBancaria {

    String banco;
    String agencia;
    String NumConta;
    String TipoConta;
    String SaldoAtual;
    String LimiteDisponivel;


    public ContaBancaria() {
   }

    
    public ContaBancaria(String banco, String agencia, String numConta, String tipoConta, String saldoAtual,
            String limiteDisponivel) {
        this.banco = banco;
        this.agencia = agencia;
        NumConta = numConta;
        TipoConta = tipoConta;
        SaldoAtual = saldoAtual;
        LimiteDisponivel = limiteDisponivel;
    }


    public String getBanco() {
        return banco;
    }
   public void setBanco(String banco) {
        this.banco = banco;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getNumConta() {
        return NumConta;
    }
    public void setNumConta(String numConta) {
        NumConta = numConta;
    }
    public String getTipoConta() {
        return TipoConta;
    }
    public void setTipoConta(String tipoConta) {
        TipoConta = tipoConta;
    }
    public String getSaldoAtual() {
        return SaldoAtual;
    }
    public void setSaldoAtual(String saldoAtual) {
        SaldoAtual = saldoAtual;
    }
    public String getLimiteDisponivel() {
        return LimiteDisponivel;
    }
    public void setLimiteDisponivel(String limiteDisponivel) {
        LimiteDisponivel = limiteDisponivel;
    }


    @Override
    public String toString() {
        return "ContaBancaria [banco=" + banco + ", agencia=" + agencia + ", NumConta=" + NumConta + ", TipoConta="
                + TipoConta + ", SaldoAtual=" + SaldoAtual + ", LimiteDisponivel=" + LimiteDisponivel + "]";
    }



    
}


