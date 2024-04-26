package day17_loops;


import java.util.Scanner;

public class atm {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        int validPin = 9345;
        int userInput;
        int attempt = 0;
        System.out.println("Welcome to ATM!");
        do{
            System.out.println("Enter your pin: ");
            userInput = key.nextInt();

            attempt++;

        }while(attempt < 3 && userInput != validPin);

        if(validPin == userInput){
            System.out.println("Logged in");
        } else {
            System.out.println("Wrong password. Try again after 7 days");
        }

        System.out.println("You use "+ attempt + " attempt");
    }
}
