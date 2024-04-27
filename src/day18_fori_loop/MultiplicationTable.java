package day18_fori_loop;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("What number you want to see the multiplication table for: ");
        int num = key.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num*i);
        }

    }
}