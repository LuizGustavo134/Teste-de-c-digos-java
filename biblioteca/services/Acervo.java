package biblioteca.services;
import biblioteca.entities.livro;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//manipuloação dos dados

public class Acervo {
    public List<String> Livro = new ArrayList<String>(); // lista que guarda os dados do livro
    final int x= 1;
    final int y = 3;
    final String generos[] = {"null","romance","ação","suspense","drama","violência"," +18 "};
    public String titulos[] = new String[x]; // dupla informação
    public String opt[] = new String[y]; // a resolver
    public int faixa[]= new int[y];
    private Scanner scan = new Scanner(System.in);

    public Acervo(){}

    public Acervo(List<String> livro, String[] titulos, String[] generos, int[] faixa) {
        this.Livro = livro;
        this.titulos = titulos;
        this.faixa = faixa;
    }
    public void formulario(livro livroIpresso){
        for (int i=0; i<titulos.length;i++){
            System.out.println("informe o tituto do livro: "); // 1°etapa do formulário
            titulos[i] = scan.nextLine();}
        System.out.println("nome do autor: ");
         String autor = scan.nextLine();

         int p =0;
        while (p <1){ // verificando dados
         System.out.println("ano de lançamento:");
        System.out.println("ex: 1950");
        int lançamento = scan.nextInt();
        scan.nextLine();
        if (lançamento < 1950 && lançamento > 2050) {
            System.out.println("Dados invalidos insira uma data aceita");
        } else if (!(lançamento < 1950 && lançamento> 2050)) { p +=2;}

        for (int i = 0; i<generos.length;i++){
            System.out.println("informe os generos do livro");
            System.out.println("(1) romance (2) ação (3) suspense"); // a resolver
            System.out.println("(4) drama (5)violência (6) conteúdo adulto");
            opt[i] = scan.nextLine();}

        }
    }
}
