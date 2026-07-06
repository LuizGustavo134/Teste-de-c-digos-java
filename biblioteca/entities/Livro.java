package biblioteca.entities;
// criação do objeto
public class Livro {
    private String titulo;
    private String autor;
    private int lançamento;
    private String genero;

    public Livro(){}
    public Livro(String titulo, String autor, int lançamento, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.lançamento = lançamento;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getLançamento() {
        return lançamento;
    }
    public void setLançamento(int lançamento) {
        this.lançamento = lançamento;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
}
