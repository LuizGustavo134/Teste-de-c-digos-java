package biblioteca.services;

import biblioteca.entities.Livro;
import java.util.Scanner;

public class Formulario {
    final int x= 1;
    final int y = 3;
    final String generoExemplo[] = {"null","romance","ação","suspense","drama","violência"," +18 "};
    public String nomes[] = new String[x]; // dupla informação 0-1 dois nomes
    public int faixa[]= new int[y];


    public Formulario(){}

    public void formulario(){
        Scanner scan = new Scanner(System.in);
        //----------------------------------Nomes-----------------------------------------------------//
        for (int i=0; i<nomes.length;i++){
            System.out.println("informe o tituto do livro: "); // 1°etapa do formulário
            System.out.println("Subtitulo:      'opcional'");  //coleta de dados
            nomes[i] = scan.nextLine();
        }
        String titulo = nomes[0];
        for (int i = 1; i<nomes.length;i++){
        if (!nomes[i].isBlank() ){
            titulo += " "+nomes[i];
        }
        }
        System.out.println("nome do autor: ");
        String autor = scan.nextLine();
 //----------------------------------Lançamento---------------------------------------------//
        int lancamento = 0;
        int p =0;
        while (p <1){ // evitando que o usuário digite ex: ano 3000 ou ano 1
            System.out.println("ano de lançamento:");
            System.out.println("exemplo acima de: 1950");
            int ano = scan.nextInt();
            scan.nextLine();
            if (ano < 1950 || ano > 2050) {
                System.out.println("Dados invalidos insira uma data acima de 1950!");
            } else {
               lancamento = ano;
               p +=2;}}
        //-----------------------------------Genero----------------------------------------------//
            for (int i=0 ;i<generoExemplo.length ;i++){
                System.out.println("(" +i+ ")"+" "+ generoExemplo[i]); // menu seleção de genero por indice
            }
            String genero = " ";
            for (int i = 0; i<1 ;i++){
                System.out.println("insira o genero: "); // escolha do usuario
                int opt = scan.nextInt();
                if (opt > 0 && opt < 6) { // concertar
                    genero = generoExemplo[opt];
                }

            }
            Livro novoLivro = new Livro(titulo,autor,lancamento,genero);

        }
}
