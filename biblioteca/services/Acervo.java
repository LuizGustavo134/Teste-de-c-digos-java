package biblioteca.services;
import java.util.ArrayList;
import java.util.List;
import biblioteca.entities.Livro;


//Armazenamento dos dados

public class Acervo {
    public List<Livro> Estante = new ArrayList<Livro>(); // lista que guarda os dados do livro

    public Acervo(){}
    public Acervo(List<Livro> Estante) {
        this.Estante = Estante;
    }
    public void addLivro(Livro Exemplar){ // Exemplar é a variál que vai receber o objeto
        Estante.add(Exemplar);             //Necessário ser o exato nome da instância do construtor
        for ( Livro Livros : Estante){     // onde o objeto foi criado
            System.out.println(Livros);
        }
    }
    //criar classe que receber o formulario em formato de lista

    }

