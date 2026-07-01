package PedraPapel.entities;

public class Player {
    String nome;
    int Score;
    int vitoria = 0;
    int derrota = 0;
    double pontos_ganhos = 0;
    public Player(){}

    public Player(String name, int derrota, int vitoria, double pontos_ganhos) {
        this.nome = name;
        this.vitoria = vitoria;
        this.derrota = derrota;
        this.pontos_ganhos = pontos_ganhos;
    }
    public Player(String name, int vitoria, double pontos_ganhos) {
        this.nome = name;
        this.vitoria = vitoria;
        this.derrota = derrota;
        this.pontos_ganhos = pontos_ganhos;
    }

    public String toString(){
        return nome
                +" "
                +vitoria
                +" "
                +derrota
                +Score;
    }

}
