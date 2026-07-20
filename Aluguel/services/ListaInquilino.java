        package Aluguel.services;

        import java.util.ArrayList;
        import java.util.List;
        import Aluguel.entities.inquilino;

        public class ListaInquilino {
            List<inquilino>inquilinos = new ArrayList<>();
            inquilino morador = new inquilino();
            public ListaInquilino(){}
            public ListaInquilino(List<inquilino> inquilinos) {
                this.inquilinos = inquilinos;
            }

            public void addInquilino(inquilino ficha){
                inquilinos.add(ficha);
            }
            public void exibir_inquilinos() {
                for (inquilino ficha : inquilinos) {
                    System.out.println(ficha);}}

            public void pesquisaPornome(String nome){
                for (inquilino ficha : inquilinos){
                    if (ficha.getNome().trim().equalsIgnoreCase(nome)){
                        System.out.println("############"+" "+"dados solicitados"+" "+"###########");
                        System.out.println(ficha);
                        System.out.println("####################################");
                    }
                }

            }
        }
