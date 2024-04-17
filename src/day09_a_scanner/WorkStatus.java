package day09_a_scanner;

import java.util.Scanner;

public class WorkStatus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("First name: ");
        String firstName = input.next();

        System.out.println("Enter your last name: ");
        String lastName = input.next();

        System.out.println("Are you employed? (true/false)");
        boolean isEmpl = input.nextBoolean();

        System.out.println("Are you student? (true/false)");
        boolean isStudent = input.nextBoolean();

        String personInfo = firstName + " " + lastName+ " \n\t is person employed: "+ isEmpl+ ".\n\t Is person student "+ isStudent;
        System.out.println(personInfo);

    }
}
