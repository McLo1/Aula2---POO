package Atividade3;

public class Livro {

    private String Titulo;
    private String Autor;
    private String ISBN;
    private int NumerodePaginas;
    private double ValorCompra;

    public Livro(String titulo, String autor, String iSBN, int numerodePaginas, double valorCompra) {
        Titulo = titulo;
        Autor = autor;
        ISBN = iSBN;
        NumerodePaginas = numerodePaginas;
        ValorCompra = valorCompra;
    }

    public String getTitulo() {
        return Titulo;
    }
    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
    public String getAutor() {
        return Autor;
    }
    public void setAutor(String autor) {
        Autor = autor;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }
    public int getNumerodePaginas() {
        return NumerodePaginas;
    }
    public void setNumerodePaginas(int numerodePaginas) {
        NumerodePaginas = numerodePaginas;
    }
    public double getValorCompra() {
        return ValorCompra;
    }
    public void setValorCompra(double valorCompra) {
        ValorCompra = valorCompra;
    }
    
    


}
