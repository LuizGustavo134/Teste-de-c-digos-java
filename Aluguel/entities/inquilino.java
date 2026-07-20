    package Aluguel.entities;

    public class inquilino {
        private String nome;
        private String predio;
        private String bloco;
        private double aluguelValor = 900;
        private double aluguelPago;
        private String aluguelStatus;

        public inquilino() {}

        public inquilino(String nome, String predio, String bloco, double aluguelPago, String aluguelStatus) {
            this.nome = nome;
            this.predio = predio;
            this.bloco = bloco;
            this.aluguelPago = aluguelPago;
            this.aluguelStatus = aluguelStatus;// preciso adiciona esse valor
        }
        public inquilino(String nome, String predio, String bloco, double aluguelPago) {
            this.nome = nome;
            this.predio = predio;
            this.bloco = bloco;
            this.aluguelPago = aluguelPago;
        }


        public String toString(){
         return nome +" "
         +predio+" "+
          bloco+" "+
          aluguelValor+" "
          +aluguelPago+" "
          +aluguelStatus; // incompleto
        }
    }
