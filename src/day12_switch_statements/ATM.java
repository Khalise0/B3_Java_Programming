package day12_switch_statements;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** Welcome to ATM ***\n\tPlease enter your pincode: ");

        int userPin = input.nextInt();
        int expectedPin = 1234;
        double balance =100000;

        if(userPin==expectedPin){
            System.out.println("You logged in");
            System.out.println("Select number for your need");
            System.out.println("\t1 - Check balance");
            System.out.println("\t2 - Withdraw");
            System.out.println("\t3 - Deposit");
            System.out.println("Your choice: ");

            int option = input.nextInt();

            if(option==1){
            }
            else if(option==2){
                System.out.println("How much you want to withdraw? $");
                double withdrawAmount = input.nextDouble();
                System.out.println("You are withdrawing $"+ withdrawAmount);
                balance -=withdrawAmount;

            }
            else if(option==3){
                System.out.println("Please insert the money: $");
                double deposit = input.nextDouble();
                balance+=deposit;

            } else {
                System.out.println("Invalid pincode.");
            }
            System.out.println("Your balance is: $" + balance);
        }
    }
}
