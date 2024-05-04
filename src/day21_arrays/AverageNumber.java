package day21_arrays;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Provide array size number: ");
        int size = input.nextInt();

        int[] num = new int[size];

        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            System.out.println("Provide numbers for Array: ");
            num[i] = input.nextInt();


        }
        for (int each : num) {
            sum += each;
        }

        System.out.println("Average: " + sum / num.length);

    }
}
