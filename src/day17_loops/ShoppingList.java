package day17_loops;


import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String list = "Shopping List:";
        String userAnswer;
        do{
            System.out.println("Enter the name of the item: ");
            String userItem = key.nextLine();
            list += "\n\t" + userItem;
            System.out.println("Do you want to add more item?");
            userAnswer = key.nextLine();
        }while(userAnswer.equalsIgnoreCase("yes")|| userAnswer.equalsIgnoreCase("Y"));
        // If the user types anything besides the "yes", "YES" or "y", "Y", the loop will stop the execution.
        // The loop will continue the ITERATION / cycling as long as user enters "YES", "yes", "Yes" or "y", "Y"


        System.out.println(list);
    }
}
