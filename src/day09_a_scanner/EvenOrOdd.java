package day09_a_scanner;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Print the number: ");
        int num = input.nextInt();
        boolean isEven = num % 2 ==0;
        boolean isNotEven = num % 2 !=0;//num % 2 == 1; num % 2 > 0 this two with positive numbers
        System.out.println( num+ " is even: "+ isEven);
        System.out.println( num+ " is  not even: "+ isNotEven);

    }
}
