package biblioteca.entities;
 // Definição do objeto
public class Livro {
    private String titulo1;
    private String titulo2;
    private String autor;
    private int lançamento;
    private String genero;

    public Livro(){}

    public Livro(String titulo1, String titulo2, String autor, int lançamento, String genero) {
        this.titulo1 = titulo1;
        this.titulo2 = titulo2;
        this.autor = autor;
        this.lançamento = lançamento;
        this.genero = genero;
    }

    @Override
    public String toString() { // Impressão de livro de forma mais aceitável
        return "Livros disponiveis: " + " \n" +
                "titulo: " + titulo1 + "  \n" +
                " Subtitulo: " + ((titulo2.isBlank()) ? "Titulo Único": titulo2) + " \n " +
                " Autor: " + autor + "  \n" +
                " Lançamento: " + lançamento +"\n"+
                "Genero" + genero;

    }
    public String getTitulo1() {
        return titulo1;
    }
    public void setTitulo1(String titulo1) {
        this.titulo1 = titulo1;
    }
    public String getTitulo2() {
        return titulo2;
    }
    public void setTitulo2(String titulo2) {
        this.titulo2 = titulo2;
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