package Aluguel.application;
import Aluguel.services.geradorInquilino;
import Aluguel.services.ListaInquilino;

import java.util.Scanner;

public class main {
    public static void main(String[]args){
        // por enquanto é só ditar o fluxo
        ListaInquilino listadeinquilinos = new ListaInquilino();
        geradorInquilino gerador = new geradorInquilino();
        Scanner scan = new Scanner(System.in);



        int loop = 0;
        gerador.gerarInquilino(listadeinquilinos);
        do {
            System.out.println("(1)Consultar morardores (2)Pesquisar morador 3 sair");
            int opt = scan.nextInt();
            scan.nextLine();
            if (opt == 1) {
                listadeinquilinos.exibir_inquilinos();
            } else if (opt == 2) {
                System.out.println("infomorme o nome do morador: ");
                String nome = scan.nextLine().trim();
                listadeinquilinos.pesquisaPornome(nome);
            }
            loop = opt;
        } while (!(loop == 3));




    }
}
