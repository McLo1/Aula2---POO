public class MainLivro {

    String Titulo;
    String Autor;
    int NumPaginas;
    double Preco;

    public MainLivro(String titulo, String autor, int numPaginas, double preco) {
        
        Titulo = titulo;
        Autor = autor;
        NumPaginas = numPaginas;
        Preco = preco;
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
    public int getNumPaginas() {
        return NumPaginas;
    }
    public void setNumPaginas(int numPaginas) {
        NumPaginas = numPaginas;
    }
    public double getPreco() {
        return Preco;
    }
    public void setPreco(double preco) {
        Preco = preco;
    }

    

}
