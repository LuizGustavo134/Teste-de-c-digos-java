package biblioteca.services;
import biblioteca.entities.Livro;
import java.util.Scanner;

public class Formulario {
    final String generoExemplo[] = {"null","romance","ação","suspense","drama","violência"," +18 "};
    public String nomes[] = new String[1]; // dupla informação 0-1 dois nomes
    public int faixa[]= new int[3];
    public Formulario(){}

    // ACV instância criada para se comunicar com a classe desejada
    public void Cadastro(Acervo acv){ // metodo que coleta os dados
        Scanner scan = new Scanner(System.in);
        //----------------------------------Nomes-----------------------------------------------------//
            System.out.println("informe o titulo do livro: ");
            String titulo1 = scan.nextLine();                       // 1°etapa do formulário
            System.out.println("SubTitulo:      'opcional'");       //coleta de dados
            String titulo2 = scan.nextLine();
            System.out.println("nome do autor: ");
            String autor = scan.nextLine();
 //----------------------------------Lançamento---------------------------------------------//
        int lancamento = 0;
        while (lancamento == 0) { // evitando que o usuário digite ex: ano 3000 ou ano 1
            System.out.println("ano de lançamento:");
            System.out.println("Obs: a data deve ser maior que 1950 e menor que 2050");
            int ano = scan.nextInt();
            scan.nextLine();
            if (ano < 1950 || ano > 2050) {
                System.out.println("Dados invalidos insira uma data correta !");
            } else {
               lancamento = ano;}}
        //-----------------------------------Genero----------------------------------------------//
            for (int i=0 ;i<generoExemplo.length ;i++){
                System.out.println("(" +i+ ")"+" "+ generoExemplo[i]); // menu seleção de genero por indice
            }
            String genero = " ";
            for (int i = 0; i<1 ;i++){
                System.out.println("insira o genero: "); // escolha do usuario
                int opt = scan.nextInt();
                scan.nextLine();
                if (opt > 0 && opt < 6) { // concertar
                    genero = generoExemplo[opt];
                }}
                Livro Exemplar = new Livro(titulo1,titulo2,autor,lancamento,genero);
            acv.addLivro(Exemplar);// usando acv para enviar o objeto para acervo

        }
}
