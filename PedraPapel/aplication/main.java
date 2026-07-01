package PedraPapel.aplication;
import PedraPapel.entities.Player;
import java.util.Scanner;
import java.math.*;

public class main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        Player jogador1 = new Player();
        int x = 3;
        double jogada[] = new double[x];
        String opt[] = {"null","pedra","papel","tesoura"};

        System.out.println("bem vindo ao pedra papel e tesoura");
        System.out.println("NickName? 'opcional mas para salvar progresso: ");
        String nome = scan.nextLine();
        System.out.println("Escolha sua jogada: ");
        System.out.println("(1) pedra (2) papel (3) tesoura");

        for (int i = 0; i < jogada.length; i++){
            jogada[i] = scan.nextInt();
            scan.nextLine();
            int machine =  (int) (Math.random() * 3) +1;
            int vitoria = 0;
            double pontos_ganhos =0;
            // caso empate
            if (machine == jogada[i]) {
                System.out.println("Empate: "+ opt[(int)jogada[i]]+" x "+ opt[machine]);
                System.out.println(jogada[i]+" "+ machine);

                // condiçõe de vitoria 1
            } else if (jogada[i] == 1 && machine == 3 ) { // pedra x tesoura
                System.out.println("você ganhou: "+ opt[(int)jogada[i]]+" vence "+ opt[machine]);
                System.out.println(jogada[i]+" "+ machine);
                pontos_ganhos = 100;
                Player jogador = new Player(nome,vitoria,pontos_ganhos);

            } else if (jogada[i] == 2 && machine == 1) { // papel x pedra
                System.out.println("você ganhou: "+ opt[(int)jogada[i]]+" vence "+ opt[machine]);
                System.out.println(jogada[i]+" "+ machine);
                pontos_ganhos= 100.00;
                Player jogador = new Player(nome,vitoria,pontos_ganhos);

            } else if (jogada[i] == 3 && machine == 2) { // tesoura x papel
                System.out.println("você ganhou: "+ opt[(int)jogada[i]]+" vence "+ opt[machine]);
                System.out.println(jogada[i]+" "+ machine);
                pontos_ganhos= 100.00;
                Player jogador = new Player(nome,vitoria,pontos_ganhos);

                // condição de derrota
            } else {
                System.out.println("voce perdeu: "+ opt[(int)jogada[i]]+" perde para "+ opt[machine]);
                System.out.println(jogada[i]+" "+ machine);
                pontos_ganhos= -50.00;
                Player jogador = new Player(nome,vitoria,pontos_ganhos);
            }

        }
        System.out.println(jogador1.toString());
    }
}