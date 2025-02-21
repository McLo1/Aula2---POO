package Exemplo;

public class Cliente extends Pessoa{

    private String datadecompra;
    private String formadePagamento;
    
    public Cliente() {
    }


    public Cliente(String nome, int idade, String datadecompra, String formadePagamento) {
        super(nome, idade);
        this.datadecompra = datadecompra;
        this.formadePagamento = formadePagamento;
    }


    public String getDatadecompra() {
        return datadecompra;
    }


    public void setDatadecompra(String datadecompra) {
        this.datadecompra = datadecompra;
    }


    public String getFormadePagamento() {
        return formadePagamento;
    }


    public void setFormadePagamento(String formadePagamento) {
        this.formadePagamento = formadePagamento;
    }


    @Override
    public String toString() {
        return "Cliente [datadecompra=" + datadecompra + ", formadePagamento=" + formadePagamento + "]";
    }


}
