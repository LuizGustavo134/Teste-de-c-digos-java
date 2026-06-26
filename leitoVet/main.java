package leitoVet;
import java.util.Scanner;
import java.util.Locale;
public class main {
    public static void main(String[]args){
        System.out.println("enter with 10 numbers: ");
        int x = 4;
        double vect[] = new double[x];
        Scanner scan = new Scanner(System.in);
        for (int i=0; i<vect.length;i++){
            vect[i] = scan.nextDouble();
            scan.nextLine();
            System.out.println();
        }

    }
}
