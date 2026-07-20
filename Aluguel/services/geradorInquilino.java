package Aluguel.services;
import Aluguel.entities.inquilino;
import java.util.Random;


public class geradorInquilino {
    public String[] nomes = {
            "João Silva",
            "Maria Oliveira",
            "Pedro Santos",
            "Ana Souza",
            "Lucas Pereira",
            "Juliana Costa",
            "Gabriel Rodrigues",
            "Larissa Almeida",
            "Rafael Ferreira",
            "Camila Gomes",
            "Matheus Ribeiro",
            "Fernanda Carvalho",
            "Gustavo Martins",
            "Beatriz Rocha",
            "Thiago Lima",
            "Isabela Barbosa",
            "Bruno Araújo",
            "Amanda Melo",
            "Diego Cardoso",
            "Patrícia Nascimento"};
    public String []predios = {null,"Predio A", "Predio B","Predio C"};
    public String []blocos = {null,"Bloco 1","Bloco 2"};
    inquilino inqui = new inquilino();

    public geradorInquilino() {}

    Random random = new Random();

    public void gerarInquilino(ListaInquilino listInq){
        for (int i = 0; i<1;i++) {
            int gerarNome = random.nextInt(0, nomes.length);
            int exPredio = random.nextInt(0, 4);
            int exBloco = random.nextInt(0, 3);
            double aluguelPago = random.nextDouble(0, 900);
            String nome = nomes[gerarNome];
            String predio = predios[exPredio];
            String bloco = blocos[exBloco];

        inquilino ficha = new inquilino(nome,predio,bloco,aluguelPago);
        listInq.addInquilino(ficha);
}}}
