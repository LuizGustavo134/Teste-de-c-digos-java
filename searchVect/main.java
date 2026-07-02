package searchVect;

import java.util.Scanner;

public class main {
    public static void main(String[]args){
        int x = 4;
        String nomes[] = new String[x];
        Scanner scan = new Scanner(System.in);
        System.out.println("insira os nomes");
        for (int i = 1; i< nomes.length; i++){
            nomes[i] = scan.nextLine();
        }
        System.out.println("deseja imprimir os valores? y/n");
        char r1= scan.next().charAt(0);
        if (r1 =='y'){
            for (int i= 1;i < nomes.length;i++){
            System.out.println(nomes[i]+ " "+ i);
            }}
        System.out.println("deseja alterar algum valor? y/n");
        char r2= scan.next().charAt(0);

        if (r2 == 'y'){
            System.out.println("insira o nome? ");
            String antigoNome = scan.nextLine();
            scan.nextLine();
            System.out.println("insira o nome que vai alterar: ");
            String novoNome = scan.nextLine();
            for (int i = 0; i < nomes.length; i++){
                if (antigoNome.equalsIgnoreCase(nomes[i])){
                    nomes[i] = novoNome;
                    System.out.println(nomes[i]+" "+i);
                }
            }
        }

    }
}
