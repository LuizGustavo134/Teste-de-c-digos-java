package searchVect;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // 1.Criando vetor e scanner
        // ==========================================
        int x = 4;
        String nomes[] = new String[x];

        Scanner scan = new Scanner(System.in);

        // 2.Entrada de dados(create)
        // ==========================================
        System.out.println("insira os nomes");
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = scan.nextLine();}

        // 3. LEITURA COMPLETA DO VETOR (OPCIONAL)
        // ==========================================
        System.out.println("deseja imprimir os valores? y/n");
        char r1 = scan.next().charAt(0);
        scan.nextLine(); // Limpa o buffer do Enter

        if (r1 == 'y') {
            for (int i = 0; i < nomes.length; i++) {
                System.out.println(i + " " + nomes[i]);
            }
        }

        // 4.Alteração de nomes
        // ==========================================
        System.out.println("deseja alterar algum nome? y/n");
        char r2 = scan.next().charAt(0);
        scan.nextLine(); // Limpa o buffer do Enter

        if (r2 == 'y') { // coleta dos dados
            System.out.println("Qual nome? ");
            String antigoNome = scan.nextLine();
            scan.nextLine();

            System.out.println("insira o novo nome: ");
            String novoNome = scan.nextLine();
            scan.nextLine();

            // Pesquisa o nome e altera para o nome informado
            for (int i = 0; i < nomes.length; i++) {
                if (antigoNome.equalsIgnoreCase(nomes[i])) {
                    nomes[i] = novoNome;
                }
                System.out.println(i + " " + nomes[i]);
            }}
        // 5.Remover nomes e deixar vazios
        // ==========================================
        System.out.println("deseja remover algum nome? y/n ");
        char r3 = scan.next().charAt(0);
        scan.nextLine(); // Limpa o buffer do Enter

        if (r3 == 'y') {
            System.out.println("informe o nome a ser removido: ");
            String remover_nome = scan.nextLine(); // variavel temporária
            scan.nextLine();

            // Busca o nome e, se achar, define a posição como vazia (null)
            for (int i = 0; i < nomes.length; i++) {
                if (remover_nome.equalsIgnoreCase(nomes[i])) {
                    nomes[i] = null;
                }}}

        // 6. EXIBIÇÃO FINAL (APENAS ÍNDICES COM VALOR)
        // ==========================================
        System.out.println("\n--- Lista de Nomes Ativos ---");
        for (int i = 0; i < nomes.length; i++) {
            // Filtro para imprimir apenas o indice com valor
            if (nomes[i] != null) {
                System.out.println(i + " " + nomes[i]);
            }
        }
        scan.close(); // Fecha o Scanner
    }}