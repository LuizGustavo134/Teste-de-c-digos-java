package BankExercise.aplicattion;
import java.util.Locale;
import java.util.Scanner;
import BankExercise.entities.*;
public class main {
    public static void main(String[]args){
        Account acount = new Account();
        Scanner scan= new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("enter with the Account Number: ");
        int number = scan.nextInt();
        System.out.println("Enter the Holder name:  ");
        scan.nextLine();
        String holder = scan.nextLine();
        System.out.println("Is there an initial deposit? (y/n) ");
        char x = scan.next().charAt(0);
        if (x == 'y'){
            System.out.println("Enter the initial value: ");
            double initialDeposit = scan.nextDouble();
            acount = new Account(holder, initialDeposit, number);
        }else {
            acount = new Account(holder,number);
        }
        System.out.println();
        System.out.println("Account data: ");
        System.out.println(acount.toString());



    scan.close();
    }
}
