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
        System.out.println("aperte (1) para começar e (2) para parar");
        int opt = scan.nextInt();

        do {
            gerador.gerarInquilino(listadeinquilinos);
            listadeinquilinos.exibir_inquilinos();
            int continuar = scan.nextInt();
            opt = continuar;
        } while (!(opt == 2 ));

    }
}
