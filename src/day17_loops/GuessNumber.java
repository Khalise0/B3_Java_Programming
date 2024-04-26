package day17_loops;


import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int secretNumber = 80;
        int userGuess;
        int attempt=0;
        do{
            System.out.println("Guess a number from 1 to 100: ");
            userGuess = key.nextInt();
            attempt++;
            if(userGuess > secretNumber){
                System.out.println(userGuess + " is higher.Guess again.");
            } else if(userGuess < secretNumber){
                System.out.println(userGuess + " is less. Guess again.");
            }
        }while(userGuess != secretNumber);
        System.out.println("You guessed correctly from the " + attempt + " attempt");
    }
}
