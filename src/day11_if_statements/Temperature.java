package day11_if_statements;
import java.util.Scanner;



public class Temperature {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter the temperature: ");
        int temp = key.nextInt();


        // This is same as the one below.
        //if (temp > 70 || temp == 70 ) {
        //
        //}

        if (temp >= 70) {
            System.out.println("Its a nice day");
            System.out.println("Go outside, but with your laptop to code java");
        } else {
            System.out.println("It is too cold");
            System.out.println("Code more java");
        }


    }

}
