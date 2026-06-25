package vetor;
import java.util.Locale;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        System.out.println("enter with the notes");
        int n = 3;
        double[] vect = new double[n];
        for (int i=0; i<vect.length; i++) {
            vect[i] = scan.nextDouble();
        }
        double sum = 0.0;
        for (int i=0; i<n; i++) {
            sum += vect[i];
        }
        double avg = sum / n;
        System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
        scan.close();
    }}