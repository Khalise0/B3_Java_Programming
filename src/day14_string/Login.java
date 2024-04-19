package day14_string;

import java.util.Scanner;

public class Login {
    public static void main(String []args){

        String expectedPassword = "loopcamp.";
        String expectedUsername = "java";

        Scanner input = new Scanner(System.in);
        System.out.print("Enter user name: ");

        String userName = input.next();

        System.out.print("Enter password: ");
        String password = input.next();

        if(password.length()> 8
                && password.equals(expectedPassword)
                && expectedUsername.equals(userName.toLowerCase())){
            System.out.println("Logged in");
        }
    }
}
