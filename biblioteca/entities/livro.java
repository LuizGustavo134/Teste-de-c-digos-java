package biblioteca.entities;
// criação do objeto
public class livro {
    private String titulo;
    private String autor;
    private int lançamento;
    private String genero;
    private double preço;
    private int faixaEtária;
    private String editora;

    public livro(){}
    public livro(String titulo, String autor, int lançamento, String genero, double preço, int faixaEtária ,String editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.lançamento = lançamento;
        this.genero = genero;
        this.preço = preço;
        this.faixaEtária = faixaEtária;
        this.editora = editora;
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

    public double getPreço() {
        return preço;
    }
    public void setPreço(double preço) {
        this.preço = preço;
    }

    public int getFaixaEtária() {
        return faixaEtária;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setFaixaEtária(int faixaEtária) {
        this.faixaEtária = faixaEtária;

    }
}
