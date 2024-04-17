package day10_if_statement;
import java.util.Scanner;
public class BankAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your balance: $");
        double balance = input.nextDouble();

        System.out.println("How much you want to withdraw? $");
        double withdraw = input.nextDouble();

        balance -= withdraw;

        if(balance<0){
            System.out.println("You took too much money. $100 overdraft fee will be applied");
            balance -= 100;
            System.out.println("Your balance after fee $" + balance);
        } else{
            System.out.println("Your balance after withdraw is $"+ balance);
        }

      //  System.out.println("Your current balance: $" + balance);
    }
}
