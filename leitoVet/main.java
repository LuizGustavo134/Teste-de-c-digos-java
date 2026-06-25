package leitoVet;
import java.util.Scanner;
import java.util.Locale;
public class main {
    public static void main(String[]args){
        System.out.println("enter with 10 numbers: ");
        int x = 10;
        double vect[] = new double[x];
        Scanner scan = new Scanner(System.in);
        for (int i=0; i<vect.length;i++){
            double Q = scan.nextDouble();
            scan.nextLine();
            vect[i] =Q;
            System.out.println(vect[i]);
        }
    }
}
